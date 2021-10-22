/**
 * 
 */
import React, { Component } from 'react';
import * as bs from "react-bootstrap";


global.constants = {
	url: 'http://127.0.0.1:8080'
}
class ItemsPage extends Component {
	url = global.constants.url
	state   { items: [], title: '', description: '' }

	handleChange = event => {
		console.log(event.target.name)
		this.setState({ [event.target.name]: event.target.value })
	}

	handleSubmit = event => {
		event.preventDefault();

		window.open(AddItemPage.js)

	}

	render() {
		return (
			<div>
				<h3>Item List</h3>
				<ItemList items={this.state.items} />
				<bs.Form onSubmit={this.handleSubmit}>
					<bs.Button>
						Add
					</bs.Button>
				</bs.Form>
			</div>
		);

	}
}
class ItemList extends React.Component {
	render() {
		return (
			<ul>
				{this.props.items.map(item => (
					<li key={item.id}>{item.title,item.description}</li>
				))}
			</ul>
		);
	}
}

export default ItemsPage;