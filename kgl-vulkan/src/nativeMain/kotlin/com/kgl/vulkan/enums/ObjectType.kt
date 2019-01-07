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
import cvulkan.*

actual enum class ObjectType(override val value: VkObjectType) : VkEnum<ObjectType> {
	UNKNOWN(VK_OBJECT_TYPE_UNKNOWN),

	SAMPLER_YCBCR_CONVERSION(VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION),

	DESCRIPTOR_UPDATE_TEMPLATE(VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE),

	SURFACE_KHR(VK_OBJECT_TYPE_SURFACE_KHR),

	SWAPCHAIN_KHR(VK_OBJECT_TYPE_SWAPCHAIN_KHR),

	DISPLAY_KHR(VK_OBJECT_TYPE_DISPLAY_KHR),

	DEBUG_REPORT_CALLBACK_EXT(VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT),

	OBJECT_TABLE_NVX(VK_OBJECT_TYPE_OBJECT_TABLE_NVX),

	DEBUG_UTILS_MESSENGER_EXT(VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT),

	VALIDATION_CACHE_EXT(VK_OBJECT_TYPE_VALIDATION_CACHE_EXT),

	ACCELERATION_STRUCTURE_NV(VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV),

	INSTANCE(VK_OBJECT_TYPE_INSTANCE),

	DISPLAY_MODE_KHR(VK_OBJECT_TYPE_DISPLAY_MODE_KHR),

	INDIRECT_COMMANDS_LAYOUT_NVX(VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX),

	PHYSICAL_DEVICE(VK_OBJECT_TYPE_PHYSICAL_DEVICE),

	DEVICE(VK_OBJECT_TYPE_DEVICE),

	QUEUE(VK_OBJECT_TYPE_QUEUE),

	SEMAPHORE(VK_OBJECT_TYPE_SEMAPHORE),

	COMMAND_BUFFER(VK_OBJECT_TYPE_COMMAND_BUFFER),

	FENCE(VK_OBJECT_TYPE_FENCE),

	DEVICE_MEMORY(VK_OBJECT_TYPE_DEVICE_MEMORY),

	BUFFER(VK_OBJECT_TYPE_BUFFER),

	IMAGE(VK_OBJECT_TYPE_IMAGE),

	EVENT(VK_OBJECT_TYPE_EVENT),

	QUERY_POOL(VK_OBJECT_TYPE_QUERY_POOL),

	BUFFER_VIEW(VK_OBJECT_TYPE_BUFFER_VIEW),

	IMAGE_VIEW(VK_OBJECT_TYPE_IMAGE_VIEW),

	SHADER_MODULE(VK_OBJECT_TYPE_SHADER_MODULE),

	PIPELINE_CACHE(VK_OBJECT_TYPE_PIPELINE_CACHE),

	PIPELINE_LAYOUT(VK_OBJECT_TYPE_PIPELINE_LAYOUT),

	RENDER_PASS(VK_OBJECT_TYPE_RENDER_PASS),

	PIPELINE(VK_OBJECT_TYPE_PIPELINE),

	DESCRIPTOR_SET_LAYOUT(VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT),

	SAMPLER(VK_OBJECT_TYPE_SAMPLER),

	DESCRIPTOR_POOL(VK_OBJECT_TYPE_DESCRIPTOR_POOL),

	DESCRIPTOR_SET(VK_OBJECT_TYPE_DESCRIPTOR_SET),

	FRAMEBUFFER(VK_OBJECT_TYPE_FRAMEBUFFER),

	COMMAND_POOL(VK_OBJECT_TYPE_COMMAND_POOL);

	companion object {
		private val enumLookUpMap: Map<UInt, ObjectType> = enumValues<ObjectType>().associateBy({
			it.value
		})

		fun from(value: VkObjectType): ObjectType = enumLookUpMap[value]!!
	}
}

