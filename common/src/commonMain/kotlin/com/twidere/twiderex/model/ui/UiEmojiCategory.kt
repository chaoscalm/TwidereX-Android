/*
 *  Twidere X
 *
 *  Copyright (C) TwidereProject and Contributors
 *
 *  This file is part of Twidere X.
 *
 *  Twidere X is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Twidere X is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Twidere X. If not, see <http://www.gnu.org/licenses/>.
 */
package com.twidere.twiderex.model.ui

import androidx.compose.runtime.Immutable
import com.twidere.twiderex.utils.ImmutableListSerializer
import kotlinx.collections.immutable.ImmutableList
import kotlinx.serialization.Serializable

@Immutable
@Serializable
data class UiEmojiCategory(
  val category: String?,
  @Serializable(ImmutableListSerializer::class)
  val emoji: ImmutableList<UiEmoji>
)

@Immutable
@Serializable
data class UiEmoji(
  val shortcode: String? = null,
  val url: String? = null,
  val staticURL: String? = null,
  val visibleInPicker: Boolean? = null,
  val category: String? = null
)
