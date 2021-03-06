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

import org.amdocs.zusammen.core.api.types.CoreMergeResult;
import org.amdocs.zusammen.sdk.collaboration.types.CollaborationMergeResult;

public class CollaborationMergeResultConvertor {
  public static CoreMergeResult convert(CollaborationMergeResult collaborationMergeResult) {

    CoreMergeResult coreMergeResult = new CoreMergeResult();
    coreMergeResult.setChange(CollaborationMergeChangeConvertor
        .convertToCoreMergeChange(collaborationMergeResult.getChange()));
    coreMergeResult.setConflict(
        CollaborationMergeConflictConvertor.convert(collaborationMergeResult.getConflict()));

    return coreMergeResult;
  }
}
