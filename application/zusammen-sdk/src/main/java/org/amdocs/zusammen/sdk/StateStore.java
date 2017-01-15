/*
 * Copyright © 2016 European Support Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.amdocs.zusammen.sdk;


import org.amdocs.zusammen.datatypes.FetchCriteria;
import org.amdocs.zusammen.datatypes.Id;
import org.amdocs.zusammen.datatypes.Namespace;
import org.amdocs.zusammen.datatypes.SessionContext;
import org.amdocs.zusammen.datatypes.item.ElementContext;
import org.amdocs.zusammen.datatypes.item.ElementInfo;
import org.amdocs.zusammen.datatypes.item.Info;
import org.amdocs.zusammen.datatypes.item.Item;
import org.amdocs.zusammen.datatypes.item.ItemVersion;
import org.amdocs.zusammen.datatypes.workspace.WorkspaceInfo;

import java.util.Collection;

public interface StateStore {

  Collection<Item> listItems(SessionContext context);

  boolean isItemExist(SessionContext context, Id itemId);

  Item getItem(SessionContext context, Id itemId);

  void createItem(SessionContext context, Id itemId, Info itemInfo);

  void saveItem(SessionContext context, Id itemId, Info itemInfo);

  void deleteItem(SessionContext context, Id itemId);

  Collection<ItemVersion> listItemVersions(SessionContext context, Id itemId);

  boolean isItemVersionExist(SessionContext context, Id itemId, Id versionId);

  ItemVersion getItemVersion(SessionContext context, Id itemId, Id versionId);

  void createItemVersion(SessionContext context, Id itemId, Id baseVersionId,
                         Id versionId, Info versionInfo);

  void publishItemVersion(SessionContext context, Id itemId, Id versionId);

  void syncItemVersion(SessionContext context, Id itemId, Id versionId);

  Collection<ElementInfo> listElements(SessionContext context, ElementContext elementContext,
                                       Id elementId);

  boolean isElementExist(SessionContext context, ElementContext elementContext, Id elementId);

  ElementInfo getElement(SessionContext context, ElementContext elementContext, Id elementId,
                         FetchCriteria fetchCriteria);

  void createElement(SessionContext context, ElementInfo element);

  void saveElement(SessionContext context, ElementInfo element);

  void deleteElement(SessionContext context,ElementInfo element);

  void createWorkspace(SessionContext context, Id workspaceId, Info workspaceInfo);

  void saveWorkspace(SessionContext context, Id workspaceId, Info workspaceInfo);

  void deleteWorkspace(SessionContext context, Id workspaceId);

  Collection<WorkspaceInfo> listWorkspaces(SessionContext context);
}