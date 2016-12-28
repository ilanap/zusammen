/*
 * Copyright © 2016 Amdocs Software Systems Limited
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

package org.amdocs.tsuzammen.sdk;


import org.amdocs.tsuzammen.commons.datatypes.Id;
import org.amdocs.tsuzammen.commons.datatypes.SessionContext;
import org.amdocs.tsuzammen.commons.datatypes.impl.item.ElementInfo;
import org.amdocs.tsuzammen.commons.datatypes.item.ElementNamespace;
import org.amdocs.tsuzammen.commons.datatypes.item.Info;
import org.amdocs.tsuzammen.commons.datatypes.item.Item;
import org.amdocs.tsuzammen.commons.datatypes.item.ItemVersion;
import org.amdocs.tsuzammen.commons.datatypes.workspace.WorkspaceInfo;

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

  ElementNamespace getEntityNamespace(SessionContext context, Id itemId, Id versionId,
                                      Id elementId);

  boolean isEntityExist(SessionContext context, Id itemId, Id versionId, Id elementId);


  ElementInfo getEntity(SessionContext context, Id itemId, Id versionId, Id elementId);

  void createEntity(SessionContext context, Id itemId, Id versionId,
                    ElementNamespace elementNamespace, ElementInfo element);

  void saveEntity(SessionContext context, Id itemId, Id versionId, ElementInfo element);

  void deleteEntity(SessionContext context, Id itemId, Id versionId, Id elementId);

  void createWorkspace(SessionContext context, Id workspaceId, Info workspaceInfo);

  void saveWorkspace(SessionContext context, Id workspaceId, Info workspaceInfo);

  void deleteWorkspace(SessionContext context, Id workspaceId);

  Collection<WorkspaceInfo> listWorkspaces(SessionContext context);
}
