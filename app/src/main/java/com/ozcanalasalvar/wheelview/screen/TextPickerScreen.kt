package com.ozcanalasalvar.wheelview.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ozcanalasalvar.wheelview.WheelView
import com.ozcanalasalvar.wheelview.SelectorOptions


@Composable
fun TextPickerScreen(modifier: Modifier = Modifier) {

    val list = mutableListOf<String>()
    for (value in 1..10) {
        list.add("$value")
    }

    val list2 = mutableListOf<String>()
    for (value in 1..3) {
        list2.add("$value")
    }



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
                    selection = 5,
                    itemCount = list.size,
                    rowOffset = 2,
                    onFocusItem = {

                    },
                    content = {
                        Text(
                            text = list[it].toString(),
                            textAlign = TextAlign.Start,
                            fontSize = 17.sp,
                            color = Color.Black
                        )
                    })
            }

            Spacer(modifier = Modifier.width(10.dp))

            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 25.dp),
                    selection = 5,
                    isEndless = false,
                    itemCount = list2.size,
                    rowOffset = 2,
                    onFocusItem = {

                    },
                    content = {
                        Text(
                            text = list[it].toString(),
                            textAlign = TextAlign.Start,
                            fontSize = 17.sp,
                            color = Color.Black
                        )
                    })
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Row {
            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 25.dp),
                    selection = 5,
                    itemCount = list.size,
                    selectorOption = SelectorOptions().copy(
                        color = Color.Magenta, alpha = 1f, width = 2.dp
                    ),
                    rowOffset = 1,
                    onFocusItem = {

                    },
                    content = {
                        Text(
                            text = list[it].toString(),
                            textAlign = TextAlign.Start,
                            fontSize = 17.sp,
                            color = Color.Black
                        )
                    })
            }

            Spacer(modifier = Modifier.width(10.dp))


            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 25.dp),
                    selection = 5,
                    selectorOption = SelectorOptions().copy(
                        color = Color.Cyan, alpha = 1f, width = 2.dp
                    ),
                    isEndless = false,
                    itemCount = 1,
                    rowOffset = 1,
                    onFocusItem = {

                    },
                    content = {
                        Text(
                            text = "1",
                            textAlign = TextAlign.Start,
                            fontSize = 17.sp,
                            color = Color.Black
                        )
                    })
            }
        }


        Spacer(modifier = Modifier.height(70.dp))

        Row {
            Box(modifier = Modifier.weight(1f)) {
                WheelView(modifier = Modifier,
                    itemSize = DpSize(150.dp, 50.dp),
                    selection = 5,
                    itemCount = list.size,
                    selectorOption = SelectorOptions().copy(
                        color = Color.Blue, alpha = 1f, width = 2.dp
                    ),
                    rowOffset = 2,
                    onFocusItem = {

                    },
                    content = {
                        Text(
                            text = list[it].toString(),
                            textAlign = TextAlign.Start,
                            fontSize = 35.sp,
                            color = Color.Black,
                        )
                    })

            }
        }
    }


}