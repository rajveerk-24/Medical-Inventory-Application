package com.sarrafenterprises.vendorapp.Screens.SignUpPage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sarrafenterprises.vendorapp.R


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun SignUpScreen() {

    var userName by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var pinCode by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        ){
        Spacer(modifier = Modifier.height(16.dp))
        Image(painter = painterResource(id = R.drawable.img_1),
            contentDescription = "Logo Image",
            modifier = Modifier
                .fillMaxSize()
                .size(150.dp)
                .align(Alignment.CenterHorizontally)
        )

        Text(text = "Pharmstore Vendor App",
            modifier = Modifier.align(Alignment.CenterHorizontally),
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Bold,
                color = MaterialTheme.colorScheme.onSurface
            ))

        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .align((Alignment.CenterHorizontally)),
            value = userName, onValueChange ={userName = it},
            label = {
                Text(text = "Full Name")
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                color = MaterialTheme.colorScheme.onSurface
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "Person")
            },
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next ) //used for next button in keyboard
        )

        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .align((Alignment.CenterHorizontally)),
            value = phone, onValueChange ={phone = it},
            label = {
                Text(text = "Phone No.")
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                color = MaterialTheme.colorScheme.onSurface
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Phone, contentDescription = "Phone")
            },
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next,
                keyboardType = KeyboardType.Phone)
        )

        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .align((Alignment.CenterHorizontally)),
            value = email, onValueChange ={email = it},
            label = {
                Text(text = "Email Id")
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                color = MaterialTheme.colorScheme.onSurface
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
            },
            minLines = 3,
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next ,
                keyboardType = KeyboardType.Email)
        )

        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .align((Alignment.CenterHorizontally)),
            value = address, onValueChange ={address = it},
            label = {
                Text(text = "Address")
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                color = MaterialTheme.colorScheme.onSurface
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Home, contentDescription = "Address")
            },
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next )
        )

        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .align((Alignment.CenterHorizontally)),
            value = pinCode, onValueChange ={pinCode = it},
            label = {
                Text(text = "Pin Code")
            },
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                color = MaterialTheme.colorScheme.onSurface
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.LocationOn, contentDescription = "Pin Code")
            },
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next
                ,keyboardType = KeyboardType.Number )
        )


        OutlinedTextField(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp)
            .align((Alignment.CenterHorizontally)),
            value = password, onValueChange ={password = it},
            label = {
                Text(text = "Password")
            },
//            visualTransformation = PasswordVisualTransformation(), //when to hide the entered password
            textStyle = TextStyle(
                fontSize = 18.sp,
                fontFamily = FontFamily.SansSerif,
                color = MaterialTheme.colorScheme.onSurface
            ),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "Password")
            },
            maxLines = 1,
            singleLine = true,
            shape = RoundedCornerShape(16.dp),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done ),
        )


        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Sign Up")
        }


    }


}