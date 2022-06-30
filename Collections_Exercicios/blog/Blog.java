import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog() {
        this.posts = new LinkedList<>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (Post post : this.posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> postsPorCategoria = new TreeMap<>();
        for (Post post : this.posts) {
            if (postsPorCategoria.containsKey(post.getCategoria())) {
                postsPorCategoria.put(post.getCategoria(), postsPorCategoria.get(post.getCategoria()) + 1);
            } else {
                postsPorCategoria.put(post.getCategoria(), 1);
            }
        }

        return postsPorCategoria;
    }

}
