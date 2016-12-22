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


import org.amdocs.tsuzammen.commons.datatypes.SessionContext;
import org.amdocs.tsuzammen.commons.datatypes.impl.item.EntityData;
import org.amdocs.tsuzammen.commons.datatypes.item.Info;
import org.amdocs.tsuzammen.commons.datatypes.item.ItemVersion;

import java.net.URI;
import java.util.Collection;

public interface CollaborationStore {



  void createItem(SessionContext context, String itemId, Info itemInfo);

  void deleteItem(SessionContext context, String itemId);

  void createItemVersion(SessionContext context, String itemId, String baseVersionId,
                         String versionId, Info versionInfo);

  void saveItemVersion(SessionContext context, String itemId, String versionId,
                       Info versionInfo);

  void deleteItemVersion(SessionContext context, String itemId, String versionId);

  void publishItemVersion(SessionContext context, String itemId, String versionId, String message);

  void syncItemVersion(SessionContext context, String itemId, String versionId);

  ItemVersion getItemVersion(SessionContext context, String itemId, String versionId,
                             ItemVersion itemVersion);

  void commitItemVersionEntities(SessionContext context, String itemId, String versionId,
                                 String message);
  void createEntity(SessionContext context, String itemId, String versionId,
                  URI namespace, EntityData entityData);

  void saveEntity(SessionContext context, String itemId, String versionId,
                  URI namespace, EntityData entityData);

  EntityData getEntity(SessionContext context, String itemId, String versionId,
                                   URI namespace,String entityId);

  Collection<EntityData> getContentEntities(SessionContext context, String itemId, String versionId,
                                            URI namespace);

  void deleteEntity(SessionContext context, String itemId, String versionId,
                                      URI namespace,String entityId);

  void deleteContentEntities(SessionContext context, String itemId, String
      versionId,URI namespace);
}
