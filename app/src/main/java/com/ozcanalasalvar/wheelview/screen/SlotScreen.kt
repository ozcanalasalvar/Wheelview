package com.ozcanalasalvar.wheelview.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ozcanalasalvar.wheelview.WheelView
import com.ozcanalasalvar.wheelview.R
import com.ozcanalasalvar.wheelview.SelectorOptions
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SlotScreen() {
    // A surface container using the 'background' color from the theme
    val coroutineScope = rememberCoroutineScope()
    val state1 = rememberLazyListState()
    val state2 = rememberLazyListState()
    val state3 = rememberLazyListState()

    val selectorOptions = SelectorOptions().copy(selectEffectEnabled = true, enabled = false)
    val userScrollEnabled = false

    val list = mutableListOf<Int>(
        R.drawable.cherry, R.drawable.watermelon, R.drawable.jackpotmachine
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Max)
                .background(Color.Blue)
        ) {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(IntrinsicSize.Max)
                    .padding(start = 20.dp, end = 20.dp)
            ) {
                WheelView(modifier = Modifier.weight(1f),
                    itemSize = DpSize(150.dp, 120.dp),
                    selection = 5,
                    itemCount = list.size,
                    rowOffset = 2,
                    selectorOption = selectorOptions,
                    lazyWheelState = state1,
                    userScrollEnabled = userScrollEnabled,
                    onFocusItem = {

                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[it]),
                            contentDescription = "test",
                            modifier = Modifier.padding(10.dp)
                        )
                    })

                Spacer(modifier = Modifier.width(10.dp))

                WheelView(modifier = Modifier.weight(1f),
                    itemSize = DpSize(150.dp, 120.dp),
                    selection = 5,
                    itemCount = list.size,
                    rowOffset = 2,
                    selectorOption = selectorOptions,
                    lazyWheelState = state2,
                    userScrollEnabled = userScrollEnabled,
                    onFocusItem = {
                        //selectedDate = selectedDate.withDay(days[it])
                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[it]),
                            contentDescription = "test",
                            modifier = Modifier.padding(10.dp)
                        )
                    })

                Spacer(modifier = Modifier.width(10.dp))

                WheelView(modifier = Modifier.weight(1f),
                    itemSize = DpSize(150.dp, 120.dp),
                    selection = 5,
                    itemCount = list.size,
                    rowOffset = 2,
                    selectorOption = selectorOptions,
                    lazyWheelState = state3,
                    userScrollEnabled = userScrollEnabled,
                    onFocusItem = {
                        //selectedDate = selectedDate.withDay(days[it])
                    },
                    content = {
                        Image(
                            painter = painterResource(id = list[it]),
                            contentDescription = "test",
                            modifier = Modifier.padding(10.dp)
                        )
                    })
            }


            Column(
                modifier = Modifier.fillMaxSize()
            ) {

                Box(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxWidth(),
                )


                Column(
                    modifier = Modifier
                        .weight(1.13f)
                        .fillMaxWidth()
                        .border(
                            width = 10.dp,
                            color = Color.Yellow,
                            shape = RectangleShape
                        )
                        .background(
                            color = Color.Transparent
                        ),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {

                }



                Box(
                    modifier = Modifier
                        .weight(2f)
                        .fillMaxWidth(),
                )
            }
        }


        Spacer(modifier = Modifier.height(30.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .padding(start = 30.dp, end = 30.dp)
                .border(
                    width = 5.dp,
                    color = Color.Red,
                    shape = RectangleShape
                )
                .background(color = Color.Transparent)
                .clickable {

                    coroutineScope.launch {
                        delay(100L)
                        val index1 = state1.firstVisibleItemIndex
                        state1.animateScrollToItem((index1 + 10..index1 + 50).random())
                        delay(100L)

                        val index2 = state2.firstVisibleItemIndex
                        state2.animateScrollToItem((index2 + 10..index2 + 50).random())
                        delay(100L)

                        val index3 = state3.firstVisibleItemIndex
                        state3.animateScrollToItem((index3 + 10..index3 + 100).random())
                        delay(100L)
                    }
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Shuffle",
                fontSize = 30.sp,
                color = Color.Red,
                modifier = Modifier
                    .padding(start = 30.dp, end = 30.dp),
                fontWeight = FontWeight.Bold

            )

        }
    }
}