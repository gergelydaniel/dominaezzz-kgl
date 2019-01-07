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

import com.kgl.vulkan.enums.ShaderInfoTypeAMD
import com.kgl.vulkan.enums.ShaderStage
import com.kgl.vulkan.utils.*
import cvulkan.*
import kotlinx.io.core.IoBuffer

actual class Pipeline(override val ptr: VkPipeline, actual val device: Device) : VkHandleNative<VkPipeline>(), VkHandle {
	override fun close() {
		val pipeline = this
		val device = pipeline.device
		VirtualStack.push()
		try {
			vkDestroyPipeline(device.toVkType(), pipeline.toVkType(), null)
		} finally {
			VirtualStack.pop()
		}
	}

	actual fun getShaderInfoAMD(
			shaderStage: ShaderStage,
			infoType: ShaderInfoTypeAMD,
			pInfo: IoBuffer?
	) {
		TODO()
		val pipeline = this
		val device = pipeline.device
		VirtualStack.push()
		try {
//			val result = vkGetShaderInfoAMD(device.toVkType(), pipeline.toVkType(),
//					shaderStage.toVkType(), infoType.toVkType(), pInfo?.writeRemaining?.toULong() ?:
//			0U, pInfo.toVkType())
//			when (result) {
//				VK_SUCCESS -> Unit
//				VK_INCOMPLETE -> Unit
//				else -> handleVkResult(result)
//			}
		} finally {
			VirtualStack.pop()
		}
	}

	actual fun compileDeferredNV(shader: UInt) {
		val pipeline = this
		val device = pipeline.device
		VirtualStack.push()
		try {
			val result = vkCompileDeferredNV(device.toVkType(), pipeline.toVkType(),
					shader.toVkType())
			if (result != VK_SUCCESS) handleVkResult(result)
		} finally {
			VirtualStack.pop()
		}
	}

	actual fun getRayTracingShaderGroupHandlesNV(firstGroup: UInt, groupCount: UInt, pData: IoBuffer) {
		val pipeline = this
		val device = pipeline.device
		VirtualStack.push()
		try {
			pData.writeDirect {
				val result = vkGetRayTracingShaderGroupHandlesNV(device.toVkType(), pipeline.toVkType(),
						firstGroup.toVkType(), groupCount.toVkType(), pData.writeRemaining.toULong(), it)
				if (result != VK_SUCCESS) handleVkResult(result)
				pData.writeRemaining
			}
		} finally {
			VirtualStack.pop()
		}
	}
}

