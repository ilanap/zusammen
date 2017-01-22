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

package org.amdocs.zusammen.core.api.types;

public class CoreMergeResult {

  CoreItemVersionConflict coreItemVersionConflict;
  CoreItemVersionChangedData coreItemVersionChangedData;

  public CoreItemVersionConflict getCoreItemVersionConflict() {
    return coreItemVersionConflict;
  }

  public void setCoreItemVersionConflict(
      CoreItemVersionConflict coreItemVersionConflict) {
    this.coreItemVersionConflict = coreItemVersionConflict;
  }

  public CoreItemVersionChangedData getCoreItemVersionChangedData() {
    return coreItemVersionChangedData;
  }

  public void setCoreItemVersionChangedData(
      CoreItemVersionChangedData coreItemVersionChangedData) {
    this.coreItemVersionChangedData = coreItemVersionChangedData;
  }

  public boolean isSuccess() {
    return this.coreItemVersionConflict==null || coreItemVersionConflict.isSuccess();
  }
}


