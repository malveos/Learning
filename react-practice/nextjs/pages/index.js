import React, { Component } from 'react';
import Link from 'next/link';
import Router from 'next/router';

class indexPage extends Component {

    static async getInitialProps(context) {
        console.log(context);
        const promise = new Promise((resolve, reject) => {
            setTimeout(() => {
                resolve({ appname: 'Superoo' });
            }, 1000);
        })
        return promise;
    }

    render() {
        return (
            <div>
                <h1>The main Page of {this.props.appname}</h1>
                <p>Go to <Link href="/auth">Auth</Link></p>
                <button onClick={() => { Router.push("/auth") }}>Auth</button>
            </div>
        );
    }

};

export default indexPage;