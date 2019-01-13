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
package com.kgl.vulkan.handles

import com.kgl.vulkan.enums.CommandBufferLevel
import com.kgl.vulkan.enums.CommandPoolReset
import com.kgl.vulkan.utils.VkFlag
import com.kgl.vulkan.utils.VkHandle

expect class CommandPool : VkHandle {
	val device: Device
	val queueFamilyIndex: UInt

	fun reset(flags: VkFlag<CommandPoolReset>? = null)

	fun allocate(level: CommandBufferLevel, commandBufferCount: UInt): List<CommandBuffer>

	fun free(commandBuffers: Collection<CommandBuffer>)

	fun trim()
}

