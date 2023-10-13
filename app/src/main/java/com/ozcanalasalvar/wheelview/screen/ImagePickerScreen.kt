package com.ozcanalasalvar.wheelview.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import com.ozcanalasalvar.wheelview.WheelView
import com.ozcanalasalvar.wheelview.R
import com.ozcanalasalvar.wheelview.SelectorOptions


@Composable
fun ImagePickerScreen(modifier: Modifier = Modifier) {

    val list = mutableListOf<Int>(
        R.drawable.cherry, R.drawable.watermelon, R.drawable.jackpotmachine
    )



    Column(
        modifier = modifier
            .fillMaxSize()
            .height(IntrinsicSize.Max)
            .padding(20.dp),
    ) {

        Row {
            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 25.dp),
                    selection = 1,
                    itemCount = list.size,
                    rowOffset = 3,
                    onFocusItem = {

                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[(0..2).random()]),
                            contentDescription = "test",
                            modifier = Modifier
                                .size(25.dp)
                                .padding(2.dp)
                        )

                    })
            }

            Spacer(modifier = Modifier.width(10.dp))

            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 25.dp),
                    selection = 1,
                    isEndless = false,
                    itemCount = list.size,
                    rowOffset = 3,
                    onFocusItem = {

                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[(0..2).random()]),
                            contentDescription = "test",
                            modifier = Modifier
                                .size(25.dp)
                                .padding(2.dp)
                        )
                    })
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Row {
            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 25.dp),
                    selection = 1,
                    itemCount = list.size,
                    selectorOption = SelectorOptions().copy(
                        color = Color.Blue, alpha = 1f, width = 2.dp
                    ),
                    rowOffset = 2,
                    onFocusItem = {

                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[(0..2).random()]),
                            contentDescription = "test",
                            modifier = Modifier
                                .size(25.dp)
                                .padding(2.dp)
                        )
                    })
            }

            Spacer(modifier = Modifier.width(20.dp))


            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 25.dp),
                    selection = 1,
                    selectorOption = SelectorOptions().copy(
                        color = Color.Red, alpha = 1f, width = 2.dp
                    ),
                    isEndless = false,
                    itemCount = 1,
                    rowOffset = 2,
                    onFocusItem = {

                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[(0..2).random()]),
                            contentDescription = "test",
                            modifier = Modifier
                                .size(25.dp)
                                .padding(2.dp)
                        )
                    })
            }
        }


        Spacer(modifier = Modifier.height(40.dp))

        Row {
            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.Center) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 50.dp),
                    selection = 1,
                    itemCount = list.size,
                    selectorOption = SelectorOptions().copy(
                        color = Color.Yellow, alpha = 1f, width = 2.dp
                    ),
                    rowOffset = 2,
                    onFocusItem = {

                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[(0..2).random()]),
                            contentDescription = "test",
                            modifier = Modifier
                                .size(50.dp)
                                .padding(5.dp)
                        )
                    })
            }

        }


    }


}