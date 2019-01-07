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
import cvulkan.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT
import cvulkan.VkDisplayEventTypeEXT

actual enum class DisplayEventTypeEXT(override val value: VkDisplayEventTypeEXT) : VkEnum<DisplayEventTypeEXT> {
	FIRST_PIXEL_OUT(VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT);

	companion object {
		fun from(value: VkDisplayEventTypeEXT): DisplayEventTypeEXT =
				enumValues<DisplayEventTypeEXT>()[value.toInt()]
	}
}

