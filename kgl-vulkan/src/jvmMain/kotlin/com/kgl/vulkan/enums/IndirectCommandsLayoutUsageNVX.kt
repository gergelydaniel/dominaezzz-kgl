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
import org.lwjgl.vulkan.NVXDeviceGeneratedCommands

actual enum class IndirectCommandsLayoutUsageNVX(override val value: Int) : VkFlag<IndirectCommandsLayoutUsageNVX> {
	UNORDERED_SEQUENCES(NVXDeviceGeneratedCommands.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX),

	SPARSE_SEQUENCES(NVXDeviceGeneratedCommands.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX),

	EMPTY_EXECUTIONS(NVXDeviceGeneratedCommands.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX),

	INDEXED_SEQUENCES(NVXDeviceGeneratedCommands.VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX);

	companion object {
		private val enumLookUpMap: Map<Int, IndirectCommandsLayoutUsageNVX> =
				enumValues<IndirectCommandsLayoutUsageNVX>().associateBy({ it.value })

		fun fromMultiple(value: Int): VkFlag<IndirectCommandsLayoutUsageNVX> = VkFlag(value)

		fun from(value: Int): IndirectCommandsLayoutUsageNVX = enumLookUpMap[value]!!
	}
}

