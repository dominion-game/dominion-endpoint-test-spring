package edu.cnm.deepdive.dominionendpointtestspring.entity;

import java.io.Serializable;
import java.util.List;


/**
 * The type Player.
 */

public class Player implements Serializable {

  public Player(Long id, int playerScore, int extraGold, int numAction, int numBuy,
      int extraGoldIfSilver) {
    this.id = id;

    this.playerScore = playerScore;
    this.extraGold = extraGold;
    this.numAction = numAction;
    this.numBuy = numBuy;
    this.extraGoldIfSilver = extraGoldIfSilver;
  }

  private Long id;



  private int playerScore;



  private int extraGold;

  private List<Card> playerHand;



private int numAction;
private int numBuy;

  private int extraGoldIfSilver;

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
  public int getNumAction() {
    return numAction;
  }

  /**
   * Sets num action.
   *
   * @param numAction the num action
   */
  public void setNumAction(int numAction) {
    this.numAction = numAction;
  }

  /**
   * Gets player's number of buys.
   *
   * @return the player's number of buys.
   */
  public int getNumBuy() {
    return numBuy;
  }

  /**
   * Sets num buy.
   *
   * @param numBuy the num buy
   */
  public void setNumBuy(int numBuy) {
    this.numBuy = numBuy;
  }

  public List<Card> getPlayerHand() {
    return playerHand;
  }

  public void setPlayerHand(List<Card> playerHand) {
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
  public void addAction(){
    numAction++;
  }

  public void addBuy(){
    numBuy++;
  }

  public void addGold(){
    extraGold++;
  }

  public void playMilitia(){
    //TODO tell game to switch states, to all engage all players.
    // other players discard down to 3 or play Moat
  }

  public void reactToMilitia(){
    //TODO other players discard down to 3 or play Moat
  }

}