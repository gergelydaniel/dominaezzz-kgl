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
package com.kgl.vulkan.dsls

import com.kgl.vulkan.enums.*
import com.kgl.vulkan.utils.VkFlag

expect class ImageCreateInfoBuilder {
	var flags: VkFlag<ImageCreate>?

	var imageType: ImageType?

	var format: Format?

	var mipLevels: UInt

	var arrayLayers: UInt

	var samples: SampleCount?

	var tiling: ImageTiling?

	var usage: VkFlag<ImageUsage>?

	var sharingMode: SharingMode?

	var initialLayout: ImageLayout?

	fun extent(width: UInt, height: UInt, depth: UInt)
}

expect class ImageMemoryRequirementsInfo2Builder

expect class ImageSparseMemoryRequirementsInfo2Builder

