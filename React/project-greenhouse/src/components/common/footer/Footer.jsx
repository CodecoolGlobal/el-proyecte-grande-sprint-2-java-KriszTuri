import '../footer/Footer.css'
import { SocialIcon } from 'react-social-icons';

function Footer () {

    return (
      <section className="footer">
        <hr className="footer-seperator" />
        <section className="footer-social-media">
          
        </section>
        <section className="footer-info">
          <section className="footer-info-left">
            <section className="footer-info__name">
                < SocialIcon url="https://www.linkedin.com/in/krisztina-turi/" />
                <br />
                Krisz Turi ©
            </section>       
          </section>
          <section className="footer-info-center">
          </section>
          <section className="footer-info-right">
            <section className="footer-info__contact">
                <br />
                <br />
                <br />
              <a href="mailto: project.greenhouse.kt@gmail.com">Contact Us</a>
              <br />
            </section>
          </section>
        </section>

      </section>
    )
  
  }
  

export default Footer;