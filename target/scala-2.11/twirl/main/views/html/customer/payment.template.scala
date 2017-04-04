
package views.html.customer

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object payment_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class payment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.users.Customer,models.users.User,List[models.Category],Form[models.users.Customer],Long,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Customer: models.users.Customer, user: models.users.User, categories: List[models.Category], addCustForm: Form[models.users.Customer], catId: Long, filter: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.166*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Payment", user, categories, catId, filter)/*6.50*/  {_display_(Seq[Any](format.raw/*6.53*/("""


	"""),format.raw/*9.2*/("""<div class="container">
		<div class="row">
			<div class="col-sm-9 padding-right">
				<h2 class="title text-center">Payment</h2>
				<div id="accordian">
					<div class="col-sm-8 col-sm-offset-1">

					
						<div class="form-group col-sm-8">
							<label for="usr">Card Number:</label>
							<input type="text" class="form-control" id="usr">
						</div>
					

				
						<div class="form-group col-sm-8">
							<label for="usr">Expiration Date:</label>
							<select class="form-control" id="sel1">
   							<option>1</option>
   							<option>2</option>
   							<option>3</option>
  							<option>4</option>
   							<option>5</option>
   							<option>6</option>
   							<option>7</option>
  							<option>8</option>
   							<option>9</option>
   							<option>10</option>
   							<option>11</option>
  							<option>12</option>
 						</select>
						</div>

						<div class="form-group col-sm-8">
						<select class="form-control " id="sel1">
   							<option>2017</option>
   							<option>2018</option>
   							<option>2019</option>
  							<option>2020</option>
   							<option>2021</option>
   							
 						</select>
						</div>
						
					
						<div class="form-group col-sm-8">
							<label for="usr">First Name:</label>
							<input type="text" class="form-control" id="usr">
						</div>
								
						<div class="form-group col-sm-8">
							<label for="usr">Last Name:</label>
							<input type="text" class="form-control" id="usr">
						</div>

						<div class="form-group col-sm-8">
							<label for="usr">Security Code:</label>
							<input type="text" class="form-control" id="usr">
						</div>

						"""),_display_(/*69.8*/form(action = routes.HomeController.addUserSubmit(catId, filter), 'class -> "form-horizontal", 'role->"form")/*69.117*/ {_display_(Seq[Any](format.raw/*69.119*/("""
						"""),format.raw/*70.7*/("""<div class="form-group col-sm-8">
							<label>
							"""),_display_(/*72.9*/inputText(addCustForm("street1"), '_label -> "Street1",'class -> "form-control ")),format.raw/*72.90*/("""
							"""),format.raw/*73.8*/("""</label>
						</div>

					<div class="form-group col-sm-8">
						<p class="text-left">
                    				<a href=""""),_display_(/*78.35*/routes/*78.41*/.ShoppingCtrl.placeOrder()),format.raw/*78.67*/("""" class="btn btn-success btn-sm">
                    				<span class="glyphicon glyphicon-euro"></span> Place Order</a>
               					</p>
					</div>	
""")))}),format.raw/*82.2*/("""

					"""),format.raw/*84.6*/("""</div>
				</div>

			</div>

			</div>








		</div>


""")))}),format.raw/*101.2*/("""
"""),format.raw/*102.1*/("""<!-- Create file payment, change routes -->


"""))
      }
    }
  }

  def render(Customer:models.users.Customer,user:models.users.User,categories:List[models.Category],addCustForm:Form[models.users.Customer],catId:Long,filter:String): play.twirl.api.HtmlFormat.Appendable = apply(Customer,user,categories,addCustForm,catId,filter)

  def f:((models.users.Customer,models.users.User,List[models.Category],Form[models.users.Customer],Long,String) => play.twirl.api.HtmlFormat.Appendable) = (Customer,user,categories,addCustForm,catId,filter) => apply(Customer,user,categories,addCustForm,catId,filter)

  def ref: this.type = this

}


}

/**/
object payment extends payment_Scope0.payment
              /*
                  -- GENERATED --
                  DATE: Tue Apr 04 16:55:53 IST 2017
                  SOURCE: /home/wdd/Desktop/project/04-04-17/app/views/customer/payment.scala.html
                  HASH: 521b5409956b622efec3d98fde0a146b493e9398
                  MATRIX: 853->1|1128->165|1156->184|1184->187|1240->235|1280->238|1310->242|3007->1913|3126->2022|3167->2024|3201->2031|3284->2088|3386->2169|3421->2177|3572->2301|3587->2307|3634->2333|3824->2493|3858->2500|3949->2560|3978->2561
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|39->9|99->69|99->69|99->69|100->70|102->72|102->72|103->73|108->78|108->78|108->78|112->82|114->84|131->101|132->102
                  -- GENERATED --
              */
          