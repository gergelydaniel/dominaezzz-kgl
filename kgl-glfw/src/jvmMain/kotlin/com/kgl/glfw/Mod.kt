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

import com.kgl.core.Flag
import org.lwjgl.glfw.GLFW.*

actual enum class Mod(override val value: Int) : Flag<Mod> {
	Shift(GLFW_MOD_SHIFT),
	Control(GLFW_MOD_CONTROL),
	Alt(GLFW_MOD_ALT),
	Super(GLFW_MOD_SUPER);
}
