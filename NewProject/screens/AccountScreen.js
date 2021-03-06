import React from "react";
import { View, Text, Button, StyleSheet } from "react-native";

const AccountScreen = ({navigation}) => {
    return (
      <View style={styles.container}>
        <Text style={styles.textStyle}>Accounts</Text>
        <Button title="Go To Home" onPress={() => navigation.navigate("Home")}/>
      </View>
    );
  }

export default AccountScreen;

const styles = StyleSheet.create({
    container: {
        flex: 1, 
        alignItems: 'center', 
        justifyContent: 'center'
    },
    textStyle: {
      fontWeight: 'bold',
      color: 'red',
    }
})