p a c k a g e   u n i t 0 1 ;  
  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . i o . P r i n t W r i t e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . S e r v l e t E x c e p t i o n ;  
 i m p o r t   j a v a x . s e r v l e t . a n n o t a t i o n . W e b S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e s p o n s e ;  
  
 / * *  
   *   S e r v l e t   i m p l e m e n t a t i o n   c l a s s   J o i n S e r v l e t  
   * /  
 @ W e b S e r v l e t ( " / J o i n S e r v l e t " )  
 p u b l i c   c l a s s   J o i n S e r v l e t   e x t e n d s   H t t p S e r v l e t   {  
 	 p r i v a t e   s t a t i c   f i n a l   l o n g   s e r i a l V e r s i o n U I D   =   1 L ;  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # H t t p S e r v l e t ( )  
 	   * /  
 	 p u b l i c   J o i n S e r v l e t ( )   {  
 	 	 s u p e r ( ) ;  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   c o n s t r u c t o r   s t u b  
 	 }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e  
 	   *             r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o G e t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	 	 	 t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 r e s p o n s e . s e t C o n t e n t T y p e ( " t e x t / h t m l ; c h a r s e t = U T F - 8 " ) ;  
 	 	 P r i n t W r i t e r   o u t   =   r e s p o n s e . g e t W r i t e r ( ) ;  
  
 	 	 S t r i n g   j o b   =   r e q u e s t . g e t P a r a m e t e r ( " j o b " ) ;  
 	 	 S t r i n g   c h k _ e m a i l   =   r e q u e s t . g e t P a r a m e t e r ( " c h k _ e m a i l " ) ;  
 	 	 S t r i n g   n a m e   =   r e q u e s t . g e t P a r a m e t e r ( " n a m e " ) ;  
 	 	 S t r i n g   n u m b e r _ f i r s t   =   r e q u e s t . g e t P a r a m e t e r ( " n u m b e r _ f i r s t " ) ;  
 	 	 S t r i n g   n u m b e r _ s e c o u n d   =   r e q u e s t . g e t P a r a m e t e r ( " n u m b e r _ s e c o u n d " ) ;  
 	 	 S t r i n g   i d   =   r e q u e s t . g e t P a r a m e t e r ( " i d " ) ;  
 	 	 S t r i n g   p w d   =   r e q u e s t . g e t P a r a m e t e r ( " p w d " ) ;  
 	 	 S t r i n g   p w d c h k   =   r e q u e s t . g e t P a r a m e t e r ( " p w d c h k " ) ;  
 	 	 S t r i n g   e m a i l _ f i r s t   =   r e q u e s t . g e t P a r a m e t e r ( " e m a i l _ f i r s t " ) ;  
 	 	 S t r i n g   e m a i l _ s e c o u n d   =   r e q u e s t . g e t P a r a m e t e r ( " e m a i l " ) ;  
 	 	 S t r i n g   a d d r _ n u m b e r   =   r e q u e s t . g e t P a r a m e t e r ( " a d d r _ n u m b e r " ) ;  
 	 	 S t r i n g   a d d r _ f i r s t   =   r e q u e s t . g e t P a r a m e t e r ( " a d d r _ f i r s t " ) ;  
 	 	 S t r i n g   a d d r _ s e c o u n d   =   r e q u e s t . g e t P a r a m e t e r ( " a d d r _ s e c o u n d " ) ;  
 	 	 S t r i n g   p h o n e   =   r e q u e s t . g e t P a r a m e t e r ( " p h o n e " ) ;  
 	 	 S t r i n g   i t e m s [ ]   =   r e q u e s t . g e t P a r a m e t e r V a l u e s ( " i t e m " ) ;  
  
 	 	 o u t . p r i n t ( " < h t m l > < b o d y > " ) ;  
 	 	 o u t . p r i n t ( " tǄ�  :   < b > "   +   n a m e   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " �����]���8�  :   < b > "   +   n u m b e r _ f i r s t   +   "   -   "   +   n u m b e r _ s e c o u n d   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " D�t��  :   < b > "   +   i d   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " D� ���8�  :   < b > "   +   p w d   +   " < b r > D� ���8�  U�x�  :   < b > "   +   p w d c h k   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " t�T�|�  :   < b > "   +   e m a i l _ f i r s t   +   " @ "   +   e m a i l _ s e c o u n d   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " �Ƹӈ�8�  :   < b > "   +   a d d r _ n u m b e r   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " �Ȍ�  :   < b > "   +   a d d r _ f i r s t   +   a d d r _ s e c o u n d   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " 4� ��ӈ�8�  :   < b > "   +   p h o n e   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " t�T�|�  ����ŀ�  :   < b > "   +   c h k _ e m a i l   +   " < b r > " ) ;  
 	 	 o u t . p r i n t ( " ����  :   < b > "   +   j o b   +   " < b r > " ) ;  
 	 	 i f   ( i t e m s   = =   n u l l )   {  
 	 	 	 o u t . p r i n t ( "  ���\�  mթ�t�  �ŵ�Ȳ�. " ) ;  
 	 	 }   e l s e   {  
 	 	 	 o u t . p r i n t ( "  ���|�  :   < b > " ) ;  
 	 	 	 f o r   ( S t r i n g   i t e m   :   i t e m s )   {  
 	 	 	 	 o u t . p r i n t ( i t e m ) ;  
 	 	 	 }  
 	 	 }  
  
 	 	 o u t . p r i n t l n ( " < b r > < a   h r e f   =   ' j a v a s c r i p t : h i s t o r y . g o ( - 1 ) ' > ���< / a > " ) ;  
 	 	 o u t . p r i n t ( " < / b o d y > < / h t m l > " ) ;  
  
 	 }  
  
 	 / * *  
 	   *   @ s e e   H t t p S e r v l e t # d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e  
 	   *             r e s p o n s e )  
 	   * /  
 	 p r o t e c t e d   v o i d   d o P o s t ( H t t p S e r v l e t R e q u e s t   r e q u e s t ,   H t t p S e r v l e t R e s p o n s e   r e s p o n s e )  
 	 	 	 t h r o w s   S e r v l e t E x c e p t i o n ,   I O E x c e p t i o n   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 d o G e t ( r e q u e s t ,   r e s p o n s e ) ;  
 	 }  
  
 } 