package edu.cnm.deepdive.dominionendpointtestspring.model.entity;

import edu.cnm.deepdive.dominionendpointtestspring.model.pojo.Card;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The type Player.
 */
@Entity
@Table
public class Player implements Serializable {

  public Player(String userName) {

this.userName = userName;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="player_id", updatable = false, nullable = false)
  private Long id;

  @Column(name = "user_name", nullable = true, updatable = false)
  private String userName;

  @Column(name = "player_score")
  private int playerScore;

  @Column(name = "cards_in_hand", nullable = true)
  private ArrayList<Card> playerHand;
  @Column(name = "cards_in_discard", nullable = true)
  private ArrayList<Card> playerDiscard;
  @Column(name = "cards_in_draw_pile", nullable = true)
  private ArrayList<Card> playerDrawPile;



  public ArrayList<Card> getPlayerDiscard() {
    return playerDiscard;
  }

  public void setPlayerDiscard(
      ArrayList<Card> playerDiscard) {
    this.playerDiscard = playerDiscard;
  }

  public ArrayList<Card> getPlayerDrawPile() {
    return playerDrawPile;
  }

  public void setPlayerDrawPile(
      ArrayList<Card> playerDrawPile) {
    this.playerDrawPile = playerDrawPile;
  }



  private boolean hasMoat;

  /**
   * Sets player score.
   *
   * @param playerScore the player score
   * @OneToMany(mappedBy= "deck", cascade = CascadeType.ALL)private List<Card> deck = new
   * LinkedList<>();
   * @OneToMany(mappedBy= "player", cascade = CascadeType.ALL)private List<Card> discard = new
   * LinkedList<>();
   * @OneToMany(mappedBy= "player", cascade = CascadeType.ALL)private List<Card> hand = new
   * LinkedList<>();
   */

  private PlayerState playerState;


  /**@OneToMany(mappedBy= "deck", cascade = CascadeType.ALL)
  private List<Card> deck = new LinkedList<>();

  @OneToMany(mappedBy= "player", cascade = CascadeType.ALL)
  private List<Card> discard = new LinkedList<>();

  @OneToMany(mappedBy= "player", cascade = CascadeType.ALL)
  private List<Card> hand = new LinkedList<>();
*/
  public void setPlayerScore(int playerScore) {
    this.playerScore = playerScore;
  }

  /**
   * Sets whose turn.
   *
   * @param whoseTurn the whose turn
   */


  public void setId(Long id) {
    this.id = id;
  }





  public PlayerState getPlayerState() {
    return playerState;
  }

  public void setPlayerState(PlayerState playerState) {
    this.playerState = playerState;
  }

  /** public void setDeck(List<Card> deck) {
    this.deck = deck;
  }

  public void setDiscard(List<Card> discard) {
    this.discard = discard;
  }

  public void setHand(List<Card> hand) {
    this.hand = hand;
  }
*/
  public Long getId() {
    return id;
  }

  /**
   * Gets game.
   *
   * @return the game
   */

  public boolean isHasMoat() {
    return hasMoat;
  }

  public void setHasMoat(boolean hasMoat) {
    this.hasMoat = hasMoat;
  }

  /**
   * Gets player score.
   *
   * @return the player score
   */
  public int getPlayerScore() {
    return playerScore;
  }

  /**
   * Gets whose turn.
   *
   * @return the whose turn
   */


  /**
   * public List<Card> getDeck() { return deck; } public List<Card> getDiscard() { return discard; }
   * public List<Card> getHand() { return hand; }
   *
   * @return the num action
   */

  /**
   * Sets num action.
   *
   * @param numAction the num action
   */


  /**
   * Gets player's number of buys.
   *
   * @return the player's number of buys.
   */

  /**
   * Sets num buy.
   *
   * @param numBuy the num buy
   */


  public ArrayList<Card> getPlayerHand() {
    return playerHand;
  }

  public void setPlayerHand(ArrayList<Card> playerHand) {
    this.playerHand = playerHand;
  }
 public enum PlayerState{
   MY_TURN,
   WATCHING,
   BUYING,
   DISCARDING,
   MILITIA_RESPONSE,
   ACTION;

 }

//  public static class Hand {
//
//  }
  /**
  private void shuffleDrawPile(){
    //TODO
  }
  private void checkDrawPile(){
    if (drawPile.size() ==0){
      //add discard to draw (remove cards from discard, add to drawPile)
      while (discard.size() > 0){
        drawPile.add(discard.remove(0));
      }
      shuffleDrawPile();
    }
  }

  public void drawCard(){
    //takes a card from the players drawPile and adds to hand
    //first remove a card from the drawPile
    //first make sure we have something to draw
    checkDrawPile();
    Card newCard = drawPile.remove(0);
    hand.add(newCard);
  }
*/



}