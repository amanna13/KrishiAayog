package com.bytebandits.krishiaayog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun DataLoadingAnimation() {
    val searching = rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.searching))
    Box(modifier = Modifier.fillMaxSize().background(Color.White), contentAlignment = Alignment.Center) {
        LottieAnimation(
            composition = searching.value,
            iterations = LottieConstants.IterateForever,
            isPlaying = true,
            modifier = Modifier.size(300.dp)
        )
    }

}