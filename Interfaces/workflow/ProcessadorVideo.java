import java.util.LinkedList;
import java.util.List;

public class ProcessadorVideo {

    private List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new LinkedList<>();
    }

    public void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormatoVideo(), TipoMensagem.LOG));
        }
    }
}
