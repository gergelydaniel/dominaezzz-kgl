/**
 * Copyright [2019] [Dominic Fischer]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kgl.vulkan.structs

import com.kgl.vulkan.enums.ExternalMemoryFeatureNV
import com.kgl.vulkan.enums.ExternalMemoryHandleTypeNV
import org.lwjgl.vulkan.VkExternalImageFormatPropertiesNV

fun ExternalImageFormatPropertiesNV.Companion.from(ptr: VkExternalImageFormatPropertiesNV): ExternalImageFormatPropertiesNV = ExternalImageFormatPropertiesNV(
		ImageFormatProperties.from(ptr.imageFormatProperties()),
		ExternalMemoryFeatureNV.fromMultiple(ptr.externalMemoryFeatures()),
		ExternalMemoryHandleTypeNV.fromMultiple(ptr.exportFromImportedHandleTypes()),
		ExternalMemoryHandleTypeNV.fromMultiple(ptr.compatibleHandleTypes())
)
