package lucasmayrink.hamburguer.exception

data class MensagemException(
    val status: Int,
    val mensagem: String?
)