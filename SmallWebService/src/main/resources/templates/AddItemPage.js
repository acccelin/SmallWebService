/**
 * 
 */
import React, { Component } from 'react';
import * as bs from "react-bootstrap";
import axios from 'axios';

global.constants = {
	url: 'http://127.0.0.1:8080'
}

class AddItemPage extends Component {
	url = global.constants.url
	state = { title: '', description: '' };


	handleChange = event => {
		console.log(event.target.name)
		this.setState({ [event.target.name]: event.target.value })
	}

	handleSubmit = event => {
		event.preventDefault();

		const item = {
			title: this.state.title,
			descirption: this.state.description
		};


		var data = "No response"
		axios.post(this.url + "/addItem", item
		).then(
			res => {
				data = res.data
				if (data != "No response") {
					window.history.back(-1)
				}
			}
		)

	}
	render() {
		return (
			<div>
				<h3>Add item</h3>
				<bs.Form onSubmit={this.handleSubmit}>
					<bs.Form.Label>Title: </bs.Form.Label>
					<bs.Form.Control type="text" name={"title"} onChange={this.handleChange} />
					<bs.Form.Label>Description: </bs.Form.Label>
					<bs.Form.Control type="text" name={"description"} onChange={this.handleChange} />
					<bs.Button>
						Submit
					</bs.Button>
				</bs.Form>
			</div>
		);

	}
}

export default AddItemPage;