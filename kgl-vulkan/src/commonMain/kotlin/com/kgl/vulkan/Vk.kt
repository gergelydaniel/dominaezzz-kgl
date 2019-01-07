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
package com.kgl.vulkan

expect object Vk {
	val MAX_PHYSICAL_DEVICE_NAME_SIZE: Int
	val UUID_SIZE: Int
	val LUID_SIZE: Int
	val MAX_EXTENSION_NAME_SIZE: Int
	val MAX_DESCRIPTION_SIZE: Int
	val MAX_MEMORY_TYPES: Int
	val MAX_MEMORY_HEAPS: Int
	val LOD_CLAMP_NONE: Float
	val REMAINING_MIP_LEVELS: UInt
	val REMAINING_ARRAY_LAYERS: UInt
	val WHOLE_SIZE: ULong
	val ATTACHMENT_UNUSED: UInt
	val TRUE: Int
	val FALSE: Int
	val QUEUE_FAMILY_IGNORED: UInt
	val QUEUE_FAMILY_EXTERNAL: UInt
	val QUEUE_FAMILY_FOREIGN_EXT: UInt
	val SUBPASS_EXTERNAL: UInt
	val MAX_DEVICE_GROUP_SIZE: Int
	val MAX_DRIVER_NAME_SIZE_KHR: Int
	val MAX_DRIVER_INFO_SIZE_KHR: Int
	val SHADER_UNUSED_NV: UInt
	val KHR_SURFACE_SPEC_VERSION: Int
	val KHR_SURFACE_EXTENSION_NAME: String
	val KHR_SWAPCHAIN_SPEC_VERSION: Int
	val KHR_SWAPCHAIN_EXTENSION_NAME: String
	val KHR_DISPLAY_SPEC_VERSION: Int
	val KHR_DISPLAY_EXTENSION_NAME: String
	val KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION: Int
	val KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME: String
	//	val KHR_XLIB_SURFACE_SPEC_VERSION: Int
//	val KHR_XLIB_SURFACE_EXTENSION_NAME: String
//	val KHR_XCB_SURFACE_SPEC_VERSION: Int
//	val KHR_XCB_SURFACE_EXTENSION_NAME: String
//	val KHR_WAYLAND_SURFACE_SPEC_VERSION: Int
//	val KHR_WAYLAND_SURFACE_EXTENSION_NAME: String
//	val KHR_ANDROID_SURFACE_SPEC_VERSION: Int
//	val KHR_ANDROID_SURFACE_EXTENSION_NAME: String
//	val KHR_WIN32_SURFACE_SPEC_VERSION: Int
//	val KHR_WIN32_SURFACE_EXTENSION_NAME: String
	val EXT_DEBUG_REPORT_SPEC_VERSION: Int
	val EXT_DEBUG_REPORT_EXTENSION_NAME: String
	val NV_GLSL_SHADER_SPEC_VERSION: Int
	val NV_GLSL_SHADER_EXTENSION_NAME: String
	val EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION: Int
	val EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME: String
	val KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION: Int
	val KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME: String
	val IMG_FILTER_CUBIC_SPEC_VERSION: Int
	val IMG_FILTER_CUBIC_EXTENSION_NAME: String
	val AMD_RASTERIZATION_ORDER_SPEC_VERSION: Int
	val AMD_RASTERIZATION_ORDER_EXTENSION_NAME: String
	val AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION: Int
	val AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME: String
	val AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION: Int
	val AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME: String
	val EXT_DEBUG_MARKER_SPEC_VERSION: Int
	val EXT_DEBUG_MARKER_EXTENSION_NAME: String
	val AMD_GCN_SHADER_SPEC_VERSION: Int
	val AMD_GCN_SHADER_EXTENSION_NAME: String
	val NV_DEDICATED_ALLOCATION_SPEC_VERSION: Int
	val NV_DEDICATED_ALLOCATION_EXTENSION_NAME: String
	val EXT_TRANSFORM_FEEDBACK_SPEC_VERSION: Int
	val EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME: String
	val AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION: Int
	val AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME: String
	val AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION: Int
	val AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME: String
	val AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION: Int
	val AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME: String
	val AMD_SHADER_BALLOT_SPEC_VERSION: Int
	val AMD_SHADER_BALLOT_EXTENSION_NAME: String
	val AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION: Int
	val AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME: String
	val AMD_SHADER_INFO_SPEC_VERSION: Int
	val AMD_SHADER_INFO_EXTENSION_NAME: String
	val AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION: Int
	val AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME: String
	val NV_CORNER_SAMPLED_IMAGE_SPEC_VERSION: Int
	val NV_CORNER_SAMPLED_IMAGE_EXTENSION_NAME: String
	val KHR_MULTIVIEW_SPEC_VERSION: Int
	val KHR_MULTIVIEW_EXTENSION_NAME: String
	val IMG_FORMAT_PVRTC_SPEC_VERSION: Int
	val IMG_FORMAT_PVRTC_EXTENSION_NAME: String
	val NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION: Int
	val NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME: String
	val NV_EXTERNAL_MEMORY_SPEC_VERSION: Int
	val NV_EXTERNAL_MEMORY_EXTENSION_NAME: String
	//	val NV_EXTERNAL_MEMORY_WIN32_SPEC_VERSION: Int
//	val NV_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME: String
//	val NV_WIN32_KEYED_MUTEX_SPEC_VERSION: Int
//	val NV_WIN32_KEYED_MUTEX_EXTENSION_NAME: String
	val KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION: Int
	val KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME: String
	val KHR_DEVICE_GROUP_SPEC_VERSION: Int
	val KHR_DEVICE_GROUP_EXTENSION_NAME: String
	val EXT_VALIDATION_FLAGS_SPEC_VERSION: Int
	val EXT_VALIDATION_FLAGS_EXTENSION_NAME: String
	//	val NN_VI_SURFACE_SPEC_VERSION: Int
//	val NN_VI_SURFACE_EXTENSION_NAME: String
	val KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION: Int
	val KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME: String
	val EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION: Int
	val EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME: String
	val EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION: Int
	val EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME: String
	val EXT_ASTC_DECODE_MODE_SPEC_VERSION: Int
	val EXT_ASTC_DECODE_MODE_EXTENSION_NAME: String
	val KHR_MAINTENANCE1_SPEC_VERSION: Int
	val KHR_MAINTENANCE1_EXTENSION_NAME: String
	val KHR_DEVICE_GROUP_CREATION_SPEC_VERSION: Int
	val KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME: String
	val MAX_DEVICE_GROUP_SIZE_KHR: Int
	val KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION: Int
	val KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME: String
	val LUID_SIZE_KHR: Int
	val KHR_EXTERNAL_MEMORY_SPEC_VERSION: Int
	val KHR_EXTERNAL_MEMORY_EXTENSION_NAME: String
	val QUEUE_FAMILY_EXTERNAL_KHR: UInt
	//	val KHR_EXTERNAL_MEMORY_WIN32_SPEC_VERSION: Int
//	val KHR_EXTERNAL_MEMORY_WIN32_EXTENSION_NAME: String
	val KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION: Int
	val KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME: String
	//	val KHR_WIN32_KEYED_MUTEX_SPEC_VERSION: Int
//	val KHR_WIN32_KEYED_MUTEX_EXTENSION_NAME: String
	val KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION: Int
	val KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME: String
	val KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION: Int
	val KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME: String
	//	val KHR_EXTERNAL_SEMAPHORE_WIN32_SPEC_VERSION: Int
//	val KHR_EXTERNAL_SEMAPHORE_WIN32_EXTENSION_NAME: String
	val KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION: Int
	val KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME: String
	val KHR_PUSH_DESCRIPTOR_SPEC_VERSION: Int
	val KHR_PUSH_DESCRIPTOR_EXTENSION_NAME: String
	val EXT_CONDITIONAL_RENDERING_SPEC_VERSION: Int
	val EXT_CONDITIONAL_RENDERING_EXTENSION_NAME: String
	val KHR_16BIT_STORAGE_SPEC_VERSION: Int
	val KHR_16BIT_STORAGE_EXTENSION_NAME: String
	val KHR_INCREMENTAL_PRESENT_SPEC_VERSION: Int
	val KHR_INCREMENTAL_PRESENT_EXTENSION_NAME: String
	val KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION: Int
	val KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME: String
	val NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION: Int
	val NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME: String
	val NV_CLIP_SPACE_W_SCALING_SPEC_VERSION: Int
	val NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME: String
	val EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION: Int
	val EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME: String
	//	val EXT_ACQUIRE_XLIB_DISPLAY_SPEC_VERSION: Int
//	val EXT_ACQUIRE_XLIB_DISPLAY_EXTENSION_NAME: String
	val EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION: Int
	val EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME: String
	val EXT_DISPLAY_CONTROL_SPEC_VERSION: Int
	val EXT_DISPLAY_CONTROL_EXTENSION_NAME: String
	val GOOGLE_DISPLAY_TIMING_SPEC_VERSION: Int
	val GOOGLE_DISPLAY_TIMING_EXTENSION_NAME: String
	val NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION: Int
	val NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME: String
	val NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION: Int
	val NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME: String
	val NV_VIEWPORT_ARRAY2_SPEC_VERSION: Int
	val NV_VIEWPORT_ARRAY2_EXTENSION_NAME: String
	val NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION: Int
	val NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME: String
	val NV_VIEWPORT_SWIZZLE_SPEC_VERSION: Int
	val NV_VIEWPORT_SWIZZLE_EXTENSION_NAME: String
	val EXT_DISCARD_RECTANGLES_SPEC_VERSION: Int
	val EXT_DISCARD_RECTANGLES_EXTENSION_NAME: String
	val EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION: Int
	val EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME: String
	val EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION: Int
	val EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME: String
	val EXT_HDR_METADATA_SPEC_VERSION: Int
	val EXT_HDR_METADATA_EXTENSION_NAME: String
	val KHR_CREATE_RENDERPASS_2_SPEC_VERSION: Int
	val KHR_CREATE_RENDERPASS_2_EXTENSION_NAME: String
	val KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION: Int
	val KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME: String
	val KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION: Int
	val KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME: String
	val KHR_EXTERNAL_FENCE_SPEC_VERSION: Int
	val KHR_EXTERNAL_FENCE_EXTENSION_NAME: String
	//	val KHR_EXTERNAL_FENCE_WIN32_SPEC_VERSION: Int
//	val KHR_EXTERNAL_FENCE_WIN32_EXTENSION_NAME: String
	val KHR_EXTERNAL_FENCE_FD_SPEC_VERSION: Int
	val KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME: String
	val KHR_MAINTENANCE2_SPEC_VERSION: Int
	val KHR_MAINTENANCE2_EXTENSION_NAME: String
	val KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION: Int
	val KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME: String
	val KHR_VARIABLE_POINTERS_SPEC_VERSION: Int
	val KHR_VARIABLE_POINTERS_EXTENSION_NAME: String
	val KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION: Int
	val KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME: String
	//	val MVK_IOS_SURFACE_SPEC_VERSION: Int
//	val MVK_IOS_SURFACE_EXTENSION_NAME: String
//	val MVK_MACOS_SURFACE_SPEC_VERSION: Int
//	val MVK_MACOS_SURFACE_EXTENSION_NAME: String
	val EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION: Int
	val EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME: String
	val EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION: Int
	val EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME: String
	val KHR_DEDICATED_ALLOCATION_SPEC_VERSION: Int
	val KHR_DEDICATED_ALLOCATION_EXTENSION_NAME: String
	val EXT_DEBUG_UTILS_SPEC_VERSION: Int
	val EXT_DEBUG_UTILS_EXTENSION_NAME: String
	//	val ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_SPEC_VERSION: Int
//	val ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME: String
	val EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION: Int
	val EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME: String
	val KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION: Int
	val KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME: String
	val AMD_GPU_SHADER_INT16_SPEC_VERSION: Int
	val AMD_GPU_SHADER_INT16_EXTENSION_NAME: String
	val AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION: Int
	val AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME: String
	val AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION: Int
	val AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME: String
	val EXT_INLINE_UNIFORM_BLOCK_SPEC_VERSION: Int
	val EXT_INLINE_UNIFORM_BLOCK_EXTENSION_NAME: String
	val EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION: Int
	val EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME: String
	val EXT_SAMPLE_LOCATIONS_SPEC_VERSION: Int
	val EXT_SAMPLE_LOCATIONS_EXTENSION_NAME: String
	val KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION: Int
	val KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME: String
	val KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION: Int
	val KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME: String
	val KHR_IMAGE_FORMAT_LIST_SPEC_VERSION: Int
	val KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME: String
	val EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION: Int
	val EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME: String
	val NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION: Int
	val NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME: String
	val NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION: Int
	val NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME: String
	val NV_FILL_RECTANGLE_SPEC_VERSION: Int
	val NV_FILL_RECTANGLE_EXTENSION_NAME: String
	val EXT_POST_DEPTH_COVERAGE_SPEC_VERSION: Int
	val EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME: String
	val KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION: Int
	val KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME: String
	val KHR_BIND_MEMORY_2_SPEC_VERSION: Int
	val KHR_BIND_MEMORY_2_EXTENSION_NAME: String
	val EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION: Int
	val EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME: String
	val EXT_VALIDATION_CACHE_SPEC_VERSION: Int
	val EXT_VALIDATION_CACHE_EXTENSION_NAME: String
	val EXT_DESCRIPTOR_INDEXING_SPEC_VERSION: Int
	val EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME: String
	val EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION: Int
	val EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME: String
	val NV_SHADING_RATE_IMAGE_SPEC_VERSION: Int
	val NV_SHADING_RATE_IMAGE_EXTENSION_NAME: String
	val NV_RAY_TRACING_SPEC_VERSION: Int
	val NV_RAY_TRACING_EXTENSION_NAME: String
	val NV_REPRESENTATIVE_FRAGMENT_TEST_SPEC_VERSION: Int
	val NV_REPRESENTATIVE_FRAGMENT_TEST_EXTENSION_NAME: String
	val KHR_MAINTENANCE3_SPEC_VERSION: Int
	val KHR_MAINTENANCE3_EXTENSION_NAME: String
	val KHR_DRAW_INDIRECT_COUNT_SPEC_VERSION: Int
	val KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME: String
	val EXT_GLOBAL_PRIORITY_SPEC_VERSION: Int
	val EXT_GLOBAL_PRIORITY_EXTENSION_NAME: String
	val KHR_8BIT_STORAGE_SPEC_VERSION: Int
	val KHR_8BIT_STORAGE_EXTENSION_NAME: String
	val EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION: Int
	val EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME: String
	val AMD_BUFFER_MARKER_SPEC_VERSION: Int
	val AMD_BUFFER_MARKER_EXTENSION_NAME: String
	val KHR_SHADER_ATOMIC_INT64_SPEC_VERSION: Int
	val KHR_SHADER_ATOMIC_INT64_EXTENSION_NAME: String
	val EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION: Int
	val EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME: String
	val AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION: Int
	val AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME: String
	val AMD_MEMORY_OVERALLOCATION_BEHAVIOR_SPEC_VERSION: Int
	val AMD_MEMORY_OVERALLOCATION_BEHAVIOR_EXTENSION_NAME: String
	val EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION: Int
	val EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME: String
	val KHR_DRIVER_PROPERTIES_SPEC_VERSION: Int
	val KHR_DRIVER_PROPERTIES_EXTENSION_NAME: String
	val NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION: Int
	val NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME: String
	val NV_COMPUTE_SHADER_DERIVATIVES_SPEC_VERSION: Int
	val NV_COMPUTE_SHADER_DERIVATIVES_EXTENSION_NAME: String
	val NV_MESH_SHADER_SPEC_VERSION: Int
	val NV_MESH_SHADER_EXTENSION_NAME: String
	val NV_FRAGMENT_SHADER_BARYCENTRIC_SPEC_VERSION: Int
	val NV_FRAGMENT_SHADER_BARYCENTRIC_EXTENSION_NAME: String
	val NV_SHADER_IMAGE_FOOTPRINT_SPEC_VERSION: Int
	val NV_SHADER_IMAGE_FOOTPRINT_EXTENSION_NAME: String
	val NV_SCISSOR_EXCLUSIVE_SPEC_VERSION: Int
	val NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME: String
	val NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION: Int
	val NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME: String
	val KHR_VULKAN_MEMORY_MODEL_SPEC_VERSION: Int
	val KHR_VULKAN_MEMORY_MODEL_EXTENSION_NAME: String
	val EXT_PCI_BUS_INFO_SPEC_VERSION: Int
	val EXT_PCI_BUS_INFO_EXTENSION_NAME: String
	//	val FUCHSIA_IMAGEPIPE_SURFACE_SPEC_VERSION: Int
//	val FUCHSIA_IMAGEPIPE_SURFACE_EXTENSION_NAME: String
	val GOOGLE_HLSL_FUNCTIONALITY1_SPEC_VERSION: Int
	val GOOGLE_HLSL_FUNCTIONALITY1_EXTENSION_NAME: String
	val GOOGLE_DECORATE_STRING_SPEC_VERSION: Int
	val GOOGLE_DECORATE_STRING_EXTENSION_NAME: String
}