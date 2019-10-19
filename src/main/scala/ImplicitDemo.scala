object ImplicitDemo extends App {

    case class TaxRate(rate: BigDecimal) {}

    implicit var sales_tax = TaxRate(0.075)

    def withTax(price: BigDecimal)(implicit tax: TaxRate) = price * (tax.rate + 1)

    println(withTax(15.00))
}




