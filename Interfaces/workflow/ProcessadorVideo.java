import java.util.ArrayList;

public class ProcessadorVideo {

    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : this.canais) {
            canal.notificar(new Mensagem(video.getArquivo() + " - " + video.getFormatoVideo(), TipoMensagem.LOG));
        }
    }
}
