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

package org.amdocs.zusammen.adaptor.outbound.impl.convertor;

import org.amdocs.zusammen.core.api.types.CorePublishResult;
import org.amdocs.zusammen.sdk.types.ElementsPublishResult;
import org.amdocs.zusammen.sdk.types.ItemVersionPublishResult;

public class PublishResultConvertor {

  public static CorePublishResult getCorePublishResult(ItemVersionPublishResult publishResult) {
    CorePublishResult corePublishResult = new CorePublishResult();
    corePublishResult.setChangedElements(
        ChangedElementConvertor.convertChangedElements(publishResult.getElementsPublishResult()
            .getChangedElements()));
    corePublishResult.setItemVersionInfo(publishResult.getItemVersionInfo());
    return corePublishResult;
  }
}
