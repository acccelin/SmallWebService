/**
 * 
 */

import React, { Component } from 'react';
import * as bs from "react-bootstrap";
import axios from 'axios';

global.constants = {
	url: 'http://127.0.0.1:8080'
}

class LoginPage extends Component {
	url = global.constants.url
	state = { username: '', password: '', state: '' };

	handleChange = event => {
		console.log(event.target.name)
		this.setState({ [event.target.name]: event.target.value })
	}

	handleSubmit = event => {
		event.preventDefault();

		const userAccount = {
			username: this.state.username,
			password: this.state.password
		};


		var data = "No response"
		axios.post(this.url + "/user", userAccount
		).then(
			res => {
				data = res.data
				if (data == -1) { this.setState({ state: "Username not exist" }) }
				else if (data == 0) { window.open(ItemPage.js) }
				else { this.setState({ state: "Password not match" }) }
			}
		)

	}

	render() {
		return (
			<div>
				<h3>Login</h3>
				<bs.Form onSubmit={this.handleSubmit} >
					<bs.Form.Label>userName: </bs.Form.Label>
					<bs.Form.Control type="text" name={"username"} onChange={this.handleChange} />
					<bs.Form.Label>password: </bs.Form.Label>
					<bs.Form.Control type="password" name={"password"} onChange={this.handleChange} />
					<bs.Button type="submit">Login</bs.Button>
					<bs.Form.Label>password: </bs.Form.Label>
				</bs.Form>
			</div>
		);
	}

}

export default LoginPage;