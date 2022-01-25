import '../navbar/Navbar.css'

function Navbar() {
    return(
        <section className = "navbar">
            <a href="/" className="navbar-item">Home</a>
            <a href="/about" className="navbar-item">About</a>
            <a href="/marketplace" className="navbar-item">MArketplace</a>
            <a href="/signup" className="navbar-item">Sign Up</a>
            <a href="/login" className="navbar-item">Log In</a>
        </section>
    )
}

export default Navbar;