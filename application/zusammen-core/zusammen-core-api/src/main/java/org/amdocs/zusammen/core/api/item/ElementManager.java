/*
 * Copyright © 2016-2017 European Support Limited
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

package org.amdocs.zusammen.core.api.item;

import org.amdocs.zusammen.core.api.types.CoreElement;
import org.amdocs.zusammen.core.api.types.CoreElementInfo;
import org.amdocs.zusammen.datatypes.Id;
import org.amdocs.zusammen.datatypes.SessionContext;
import org.amdocs.zusammen.datatypes.item.ElementContext;
import org.amdocs.zusammen.datatypes.searchindex.SearchCriteria;
import org.amdocs.zusammen.datatypes.searchindex.SearchResult;

import java.util.Collection;

public interface ElementManager {

  Collection<CoreElementInfo> list(SessionContext context, ElementContext elementContext, Id
      elementId);

  CoreElementInfo getInfo(SessionContext context, ElementContext elementContext, Id elementId);

  CoreElement get(SessionContext context, ElementContext elementContext, Id elementId);

  void save(SessionContext context, ElementContext elementContext, CoreElement element,
            String message);

  SearchResult search(SessionContext context, SearchCriteria searchCriteria);
}
