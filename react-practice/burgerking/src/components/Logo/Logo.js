import React from 'react'
import classes from './Logo.css'
import burgerLogo from '../../assets/images/Burger-logo.png'

const logo = props => {
    return <div className={classes.Logo}>
        <img src={burgerLogo} alt="MyBurger"/>
    </div>
}

export default logo;