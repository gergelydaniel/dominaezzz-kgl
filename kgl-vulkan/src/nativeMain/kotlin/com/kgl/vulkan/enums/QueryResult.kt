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
import cvulkan.*

actual enum class QueryResult(override val value: VkQueryResultFlagBits) : VkFlag<QueryResult> {
	`64`(VK_QUERY_RESULT_64_BIT),

	WAIT(VK_QUERY_RESULT_WAIT_BIT),

	WITH_AVAILABILITY(VK_QUERY_RESULT_WITH_AVAILABILITY_BIT),

	PARTIAL(VK_QUERY_RESULT_PARTIAL_BIT);

	companion object {
		private val enumLookUpMap: Map<UInt, QueryResult> = enumValues<QueryResult>().associateBy({
			it.value
		})

		fun fromMultiple(value: VkQueryResultFlagBits): VkFlag<QueryResult> = VkFlag(value)

		fun from(value: VkQueryResultFlagBits): QueryResult = enumLookUpMap[value]!!
	}
}

