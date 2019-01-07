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

import com.kgl.vulkan.enums.DescriptorType
import com.kgl.vulkan.enums.ShaderStage
import com.kgl.vulkan.handles.Sampler
import com.kgl.vulkan.utils.VkFlag
import com.kgl.vulkan.utils.toVkType
import org.lwjgl.vulkan.VkDescriptorSetLayoutBinding

actual class DescriptorSetLayoutBindingBuilder(internal val target: VkDescriptorSetLayoutBinding) {
	actual var binding: UInt
		get() = target.binding().toUInt()
		set(value) {
			target.binding(value.toVkType())
		}

	actual var descriptorType: DescriptorType?
		get() = DescriptorType.from(target.descriptorType())
		set(value) {
			target.descriptorType(value.toVkType())
		}

	actual var stageFlags: VkFlag<ShaderStage>?
		get() = ShaderStage.fromMultiple(target.stageFlags())
		set(value) {
			target.stageFlags(value.toVkType())
		}

	internal fun init(immutableSamplers: Collection<Sampler>?) {
		target.pImmutableSamplers(immutableSamplers?.toVkType())
	}
}

actual class DescriptorSetLayoutBindingsBuilder {
	val targets: MutableList<(VkDescriptorSetLayoutBinding) -> Unit> = mutableListOf()

	actual fun binding(immutableSamplers: Collection<Sampler>?, block: DescriptorSetLayoutBindingBuilder.() -> Unit) {
		targets += {
			val builder = DescriptorSetLayoutBindingBuilder(it)
			builder.init(immutableSamplers)
			builder.apply(block)
		}
	}
}

