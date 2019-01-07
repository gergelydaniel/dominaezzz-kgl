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
package com.kgl.vulkan.enums

import com.kgl.vulkan.utils.VkEnum
import org.lwjgl.vulkan.VK11

actual enum class PointClippingBehavior(override val value: Int) : VkEnum<PointClippingBehavior> {
	ALL_CLIP_PLANES(VK11.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES),

	USER_CLIP_PLANES_ONLY(VK11.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY);

	companion object {
		fun from(value: Int): PointClippingBehavior = enumValues<PointClippingBehavior>()[value]
	}
}

