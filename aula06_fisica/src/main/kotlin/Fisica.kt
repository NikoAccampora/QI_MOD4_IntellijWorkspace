import kotlin.math.pow

class Fisica {

    fun ForcaPeso(massa: Float, gravidade: Float): Float {
        return massa * gravidade
    }

    fun ForcaCentripeta(massa: Float, velocidade: Float, raio: Float): Float {

        return massa * ((velocidade.pow(2))/raio)
    }

    fun Impulso(forca: Float, tempo1: Float, tempo2: Float): Float {
        return forca * (tempo2 - tempo1)
    }

    fun ForcaElastica(constElastic: Float, deformacao: Float): Float {
        return constElastic * deformacao
    }

    fun VelocidadeMedia(tempo1: Float, tempo2: Float, pos1: Float, pos2: Float): Float {
        return ((pos2 - pos1) / (tempo2 - tempo1) * 3.6f)
    }

    fun MovimentoUniforme(velocidade: Float, tempo: Float, posicao: Float): Float {
        return posicao + (velocidade*tempo)
    }

    fun MovimentoUniformeVariado(aceleracao: Float, tempo1: Float,tempo2: Float, velocidade: Float): Float {
        return velocidade + (aceleracao*(tempo1-tempo2))
    }
}