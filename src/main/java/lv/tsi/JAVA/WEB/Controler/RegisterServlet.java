package lv.tsi.JAVA.WEB.Controler;

import lv.tsi.model.GameManager;
import lv.tsi.model.PlayerGameContext;
import lv.tsi.model.game;
import lv.tsi.model.player;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    @Inject
    private PlayerGameContext playerGameContext; //dobovljaem imenno v sessiju

    @Inject
    private GameManager gameManager;



    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("player-name");   ///uznajom kakoe imja u usera
        player player = new player();
        player.setName(name);

        playerGameContext.setPlayer(player);
        game game = gameManager.register(player);
        playerGameContext.setgame(game);

        response.sendRedirect("WaitEnemyRegister");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


            request.getRequestDispatcher("/WEB-INF/register.jsp").include(request, response);  //na servere ottabotal register.jsp
        }
    }
