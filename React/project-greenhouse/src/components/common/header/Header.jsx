import React from "react";
import { Navbar } from ".."; 
import '../header/Header.css'

function Header() {

    return(
        <>
        <section className = "header">
            <section className="header-top">
                <section className="header-top__logo">
                    <a href ="/" className="header-logo"><img src={`${process.env.PUBLIC_URL}/assets/images/logo.png`} alt="logo"/></a>
                </section>
                <section className="header-top__navbar">
                    <section className="header-top__navigation">{<Navbar />}</section>
                </section>
            </section>

            <section className="header-top__separator">
                <hr className="header-top__seperator" />
            </section>
        </section>
        </>
    )
}

export default Header;