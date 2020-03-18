package com.amanjit.taskjunittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteAInFirst2PosTest 
{
	/*TO DO LIST
	 * 
	 * 1. A IN 1ST POS: ABCD=>BCD - SUCCESS
	 * 2. A IN 2ND POS: BACD=>BCD - SUCCESS
	 * 3. A's IN 1ST 2 POS: AACD=>CD - SUCCESS
	 * 4. NO A IN STRING: BCDE=>BCDE - SUCCESS
	 * 5. NO STRING: ""=>"" - SUCCESS
	 * 6. A's NOT IN 1ST 2 POS: BBAA=>BBAA - SUCCESS
	 * 7. A's IN 1ST, 2ND AND OTHER POS: AABAA=>BAA - SUCCESS
	 */

	@Test
	void testAIn1stPos() 
	{
		DeleteAInFirst2Pos deleteAInFirst2Pos=new DeleteAInFirst2Pos();
		assertEquals("BCD", deleteAInFirst2Pos.remove("ABCD"));
	}
	
	@Test
	void testAIn2ndPos() 
	{
		DeleteAInFirst2Pos deleteAInFirst2Pos=new DeleteAInFirst2Pos();
		assertEquals("BCD", deleteAInFirst2Pos.remove("BACD"));
	}
	
	@Test
	void testAIn1st2Pos() 
	{
		DeleteAInFirst2Pos deleteAInFirst2Pos=new DeleteAInFirst2Pos();
		assertEquals("CD", deleteAInFirst2Pos.remove("AACD"));
	}
	
	@Test
	void testNoAInString() 
	{
		DeleteAInFirst2Pos deleteAInFirst2Pos=new DeleteAInFirst2Pos();
		assertEquals("BCDE", deleteAInFirst2Pos.remove("BCDE"));
	}
	
	@Test
	void testANotIn1st2Pos() 
	{
		DeleteAInFirst2Pos deleteAInFirst2Pos=new DeleteAInFirst2Pos();
		assertEquals("BBAA", deleteAInFirst2Pos.remove("BBAA"));
	}
	
	@Test
	void testAIn1st2ndAndOtherPos() 
	{
		DeleteAInFirst2Pos deleteAInFirst2Pos=new DeleteAInFirst2Pos();
		assertEquals("BBAA", deleteAInFirst2Pos.remove("AABBAA"));
	}

}
