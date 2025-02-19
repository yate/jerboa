package com.jerboa.datatypes.types

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonMentionView(
    val person_mention: PersonMention,
    val comment: Comment,
    val creator: Person,
    val post: Post,
    val community: Community,
    val recipient: Person,
    val counts: CommentAggregates,
    val creator_banned_from_community: Boolean,
    val subscribed: SubscribedType /* "Subscribed" | "NotSubscribed" | "Pending" */,
    val saved: Boolean,
    val creator_blocked: Boolean,
    val my_vote: Int? = null,
) : Parcelable
