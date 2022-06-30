import java.util.*;

public class Blog {

    private List<Post> posts;

    public Blog() {
        this.posts = new LinkedList<>();
    }

    public void adicionarPostagem(Post post) throws IllegalArgumentException {
        for (Post obj : this.posts) {
            if (obj.getTitulo().equals(post.getTitulo()) && obj.getAutor().equals(post.getAutor())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : this.posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postsDoAutor = new TreeSet<>();
        for (Post post : this.posts) {
            if (post.getAutor().equals(autor)) {
                postsDoAutor.add(post);
            }
        }
        return postsDoAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postsDaCategoria = new TreeSet<>();
        for (Post post : this.posts) {
            if (post.getCategoria().equals(categoria)) {
                postsDaCategoria.add(post);
            }
        }
        return postsDaCategoria;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> postsPorCategoria = new TreeMap<>();
        for (Post post : this.posts) {
            postsPorCategoria.put(post.getCategoria(), this.obterPostsPorCategoria(post.getCategoria()));
        }
        return postsPorCategoria;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> postsPorAutor = new TreeMap<>();
        for (Post post : this.posts) {
            postsPorAutor.put(post.getAutor(), this.obterPostsPorAutor(post.getAutor()));
        }
        return postsPorAutor;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> quantidadePostsPorCategoria = new TreeMap<>();
        for (Post post : this.posts) {
            if (quantidadePostsPorCategoria.containsKey(post.getCategoria())) {
                quantidadePostsPorCategoria.put(post.getCategoria(), quantidadePostsPorCategoria.get(post.getCategoria()) + 1);
            } else {
                quantidadePostsPorCategoria.put(post.getCategoria(), 1);
            }
        }
        return quantidadePostsPorCategoria;
    }

}
