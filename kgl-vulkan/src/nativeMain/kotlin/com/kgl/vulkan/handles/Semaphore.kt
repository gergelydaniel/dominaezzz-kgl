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

import com.kgl.vulkan.dsls.ImportSemaphoreFdInfoKHRBuilder
import com.kgl.vulkan.dsls.SemaphoreGetFdInfoKHRBuilder
import com.kgl.vulkan.utils.*
import cvulkan.*
import kotlinx.cinterop.*

actual class Semaphore(override val ptr: VkSemaphore, actual val device: Device) : VkHandleNative<VkSemaphore>(), VkHandle {
	override fun close() {
		val semaphore = this
		val device = semaphore.device
		VirtualStack.push()
		try {
			vkDestroySemaphore(device.toVkType(), semaphore.toVkType(), null)
		} finally {
			VirtualStack.pop()
		}
	}

	actual fun getFdKHR(block: SemaphoreGetFdInfoKHRBuilder.() -> Unit): Int {
		val semaphore = this
		val device = semaphore.device
		VirtualStack.push()
		try {
			val target = VirtualStack.alloc<VkSemaphoreGetFdInfoKHR>().ptr
			val builder = SemaphoreGetFdInfoKHRBuilder(target.pointed)
			builder.init(semaphore)
			builder.apply(block)
			val outputVar = VirtualStack.alloc<IntVar>()
			val outputPtr = outputVar.ptr
			val result = vkGetSemaphoreFdKHR(device.toVkType(), target, outputPtr)
			if (result != VK_SUCCESS) handleVkResult(result)
			return outputVar.value
		} finally {
			VirtualStack.pop()
		}
	}

	actual fun importFdKHR(block: ImportSemaphoreFdInfoKHRBuilder.() -> Unit) {
		val semaphore = this
		val device = semaphore.device
		VirtualStack.push()
		try {
			val target = VirtualStack.alloc<VkImportSemaphoreFdInfoKHR>().ptr
			val builder = ImportSemaphoreFdInfoKHRBuilder(target.pointed)
			builder.init(semaphore)
			builder.apply(block)
			val result = vkImportSemaphoreFdKHR(device.toVkType(), target)
			if (result != VK_SUCCESS) handleVkResult(result)
		} finally {
			VirtualStack.pop()
		}
	}
}

