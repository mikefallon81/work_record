import { Component, React } from "react";
import axios from 'axios';


class HomeComponent extends Component {

    constructor(props) {
        super(props);
        this.state = {
            customers: [],
            jobs: []
            
        }
    }

    async getCustomers(){
        const response = await axios.get("http://localhost:8080/customers");
        this.setState({customers: response.data._embedded.customers})
    }

    componentDidMount(){
        this.getCustomers();
    }

    render(){
        return (
            <>
            <h1>{this.props.title}</h1>

            <h2>Customer</h2>
            {/* <h3>Name: {this.state.customers[0].name}</h3>
            <h3>Email: {this.state.customers[0].email}</h3>
            <h3>Contact Number: {this.state.customers[0].contactNumber}</h3> */}
            </>
        )
    }
}

export default HomeComponent;