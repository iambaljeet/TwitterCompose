package com.app.twittercompose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Replay
import androidx.compose.material.icons.outlined.Reply
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.twittercompose.state.Tweets

@Composable
fun TweetComponent(tweets: Tweets) {
    Column(
        modifier = Modifier.padding(
            top = 10.dp,
            start = 10.dp,
            end = 10.dp
        ).fillMaxWidth().wrapContentHeight()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().wrapContentHeight()
        ) {
            CircularImage(
                image = imageResource(id = tweets.userProfilePic),
                modifier = Modifier.preferredSize(60.dp)
            )
            SeparatorSpacer(modifier = Modifier.width(8.dp))
            Column(
                modifier = Modifier.fillMaxWidth().wrapContentHeight()
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth().wrapContentHeight()
                ) {
                    Text(
                        text = tweets.userName,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp
                    )
                    SeparatorSpacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = tweets.userAccountHandle,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                    SeparatorSpacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = tweets.timeStamp,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                }
                if (!tweets.content.isNullOrBlank()) {
                    SeparatorSpacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = tweets.content,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp
                    )
                }
                if (tweets.image != null) {
                    SeparatorSpacer(modifier = Modifier.height(8.dp))
                    Image(
                        modifier = Modifier.fillMaxWidth()
                            .preferredHeight(180.dp),
                        bitmap = imageResource(id = tweets.image),
                        contentScale = ContentScale.FillWidth,
                    )
                }
                SeparatorSpacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TweetOptions(
                        icon = Icons.Outlined.Reply,
                        count = tweets.commentCount.toString()
                    )
                    TweetOptions(
                        icon = Icons.Outlined.Replay,
                        count = tweets.retweetCount.toString()
                    )
                    TweetOptions(
                        icon = Icons.Outlined.Star,
                        count = tweets.likeCount.toString()
                    )
                    TweetOptions(
                        icon = Icons.Outlined.Share,
                        count = null
                    )
                }
            }
        }
        SeparatorDivider()
    }
}

@Composable
fun TweetOptions(icon: ImageVector, count: String?) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon
        )
        SeparatorSpacer(modifier = Modifier.width(5.dp))
        if (count != null) {
            Text(text = count,
                maxLines = 1,
                fontSize = 14.sp,
                overflow = TextOverflow.Ellipsis)
        }
    }
}