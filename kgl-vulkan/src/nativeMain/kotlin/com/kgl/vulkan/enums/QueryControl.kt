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

import com.kgl.vulkan.utils.VkFlag
import cvulkan.VK_QUERY_CONTROL_PRECISE_BIT
import cvulkan.VkQueryControlFlagBits

actual enum class QueryControl(override val value: VkQueryControlFlagBits) : VkFlag<QueryControl> {
	PRECISE(VK_QUERY_CONTROL_PRECISE_BIT);

	companion object {
		private val enumLookUpMap: Map<UInt, QueryControl> = enumValues<QueryControl>().associateBy({
			it.value
		})

		fun fromMultiple(value: VkQueryControlFlagBits): VkFlag<QueryControl> = VkFlag(value)

		fun from(value: VkQueryControlFlagBits): QueryControl = enumLookUpMap[value]!!
	}
}

