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
package com.kgl.glfw

import kotlinx.io.core.Closeable
import org.lwjgl.glfw.GLFW.*
import org.lwjgl.glfw.GLFWImage
import org.lwjgl.system.MemoryStack

actual class Cursor : Closeable {
	internal val ptr: Long

	actual constructor(image: Image, xhot: Int, yhot: Int) {
		ptr = MemoryStack.stackPush().use {
			val imagePtr = GLFWImage.callocStack(it)
			imagePtr.width(xhot)
			imagePtr.height(yhot)
			TODO()
			glfwCreateCursor(imagePtr, xhot, yhot)
		}
	}

	actual constructor(shape: Standard) {
		ptr = glfwCreateStandardCursor(shape.ordinal)
	}

	override fun close() {
		glfwDestroyCursor(ptr)
	}

	actual enum class Standard(private val value: Int) {
		Arrow(GLFW_ARROW_CURSOR),
		IBeam(GLFW_IBEAM_CURSOR),
		CrossHair(GLFW_CROSSHAIR_CURSOR),
		Hand(GLFW_HAND_CURSOR),
		HResize(GLFW_HRESIZE_CURSOR),
		VResize(GLFW_VRESIZE_CURSOR);
	}
}
