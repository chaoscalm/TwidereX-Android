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
package com.twidere.twiderex.model.ui.mastodon

import androidx.compose.runtime.Immutable
import com.twidere.twiderex.model.enums.MastodonStatusType
import com.twidere.twiderex.model.enums.MastodonVisibility
import com.twidere.twiderex.model.ui.StatusExtra
import com.twidere.twiderex.model.ui.UiEmojiCategory
import com.twidere.twiderex.utils.ImmutableListSerializer
import kotlinx.collections.immutable.ImmutableList
import kotlinx.serialization.Serializable

@Immutable
@Serializable
data class MastodonStatusExtra(
  val type: MastodonStatusType,
  @Serializable(ImmutableListSerializer::class)
  val emoji: ImmutableList<UiEmojiCategory>,
  val visibility: MastodonVisibility,
  @Serializable(ImmutableListSerializer::class)
  val mentions: ImmutableList<MastodonMention>?,
) : StatusExtra

@Immutable
@Serializable
data class MastodonMention(
  val id: String? = null,
  val username: String? = null,
  val url: String? = null,
  val acct: String? = null
)
