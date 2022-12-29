package jpql;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setAge(10);
//            em.persist(member);

//            TypedQuery<Member> query =  em.createQuery("select m from Member  m", Member.class);
//            TypedQuery<String> query2 =  em.createQuery("select m.username from Member  m", String.class);
//            Query query3 =  em.createQuery("select m.username, m.age from Member  m");
//
//            List<Member> resultList = query.getResultList();
//
//            for (Member member1 : resultList) {
//                System.out.println("member1 = " + member1);
//            }
//
//            Member result = query.getSingleResult();
//            System.out.println("result = " + result);
//
//            Member result =  em.createQuery("select m from Member m where m.username = :username", Member.class)
//                            .setParameter("username", "member1")
//                    .getSingleResult();
//            System.out.println("singleResult = " + result.getUsername());

//            em.flush();
//            em.clear();

//            List<Member> result = em.createQuery("select m from Member m", Member.class)
//                    .getResultList();

//            Member findMember= result.get(0);
//            findMember.setAge(20);

//            List<Team> result1 = em.createQuery("select m.team from Member m", Team.class)
//                    .getResultList();
//            List<Team> result2 = em.createQuery("select t from Member m join m.team t", Team.class)
//                    .getResultList();
//            em.createQuery("select o.address from Order o", Address.class)
//                    .getResultList();
//            List resultList = em.createQuery("select distinct m.username, m.age from Member m")
//                    .getResultList();
//
//            Object o = resultList.get(0);
//            Object[] result = (Object[]) o;
//            System.out.println("result = " + result[0]);
//            System.out.println("result = " + result[1]);

//            List<MemberDto> resultList = em.createQuery("select new jpql.MemberDto(m.username, m.age) from Member m", MemberDto.class)
//                    .getResultList();
//
//            MemberDto memberDto = resultList.get(0);
//            System.out.println("memberDto = " + memberDto.getUsername());
//            System.out.println("memberDto = " + memberDto.getAge());

//            for (int i = 0; i< 100; i++){
//                Member member = new Member();
//                member.setUsername("member" + i);
//                member.setAge(i);
//                em.persist(member);
//            }
//
//            em.flush();
//            em.clear();
//
//            List<Member> result = em.createQuery("select m from Member m order by m.age desc ", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            System.out.println("result.size = " + result.size());
//            for (Member member1 : result) {
//                System.out.println("member1 = " + member1);
//            }

            //
//            Team team = new Team();
//            team.setName("teamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setAge(10);
//            member.setTeam(team);
//            em.persist(member);
//
//            em.flush();
//            em.clear();

//            String query = "select m from Member m inner join m.team t";
//            String query2 = "select m from Member m left outer join m.team t";
//            String query3 = "select m from Member m left join m.team t on t.name = 'teamA'";
//            String query4 = "select m from Member m left join Team t on m.username = t.name";
//            String query5 = "select (select avg (m1.age) from Member m1) as avgAge from Member m join Team t on m.username = t.name";
//            // from 절 서브쿼리는 불가 (조인으로 풀수 있을 시 풀어서 사용)
////            String query6 = "select mm.age, mm.username from (select m.age from Member m) as mm";
//            List<Member> result = em.createQuery(query, Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            List<Member> result2 = em.createQuery(query2, Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            List<Member> result3 = em.createQuery(query3, Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            List<Member> result4 = em.createQuery(query4, Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            List<Member> result5 = em.createQuery(query5, Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();

//            Team team = new Team();
//            team.setName("teamA");
//            em.persist(team);
//
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setAge(10);
//            member.setType(MemberType.ADMIN);
//            member.setTeam(team);
//            em.persist(member);
//
//            em.flush();
//            em.clear();

//            String query = "select m.username, 'HELLO', TRUE FROM Member m";
//            String query = "select m.username, 'HELLO', TRUE FROM Member m" +
//                    " where m.type = jpql.MemberType.ADMIN";
//            String query = "select m.username, 'HELLO', TRUE FROM Member m" +
//                    " where m.type = :userType";
//            String query = "select m.username, 'HELLO', TRUE FROM Member m" +
//                    " where m.username is not null ";
//            String query = "select m.username, 'HELLO', TRUE FROM Member m" +
//                    " where m.age between 0 and 10";

//            List<Object[]> result = em.createQuery(query)
//                    .getResultList();
//            List<Object[]> result = em.createQuery(query)
//                    .setParameter("userType", MemberType.ADMIN)
//                    .getResultList();

//            for (Object[] objects : result) {
//                System.out.println("objects = " + objects[0]);
//                System.out.println("objects = " + objects[1]);
//                System.out.println("objects = " + objects[2]);
//            }

//            String query =
//                    "select " +
//                            "case when m.age <= 10 then '학생요금'" +
//                            "when m.age >= 60 then '경로요금'" +
//                            "else '일반요금' end " +
//                            "from Member m ";

//            String query = "select coalesce(m.username, '이름없는 회원') from Member m";
//            String query = "select nullif(m.username, 'member1') as username from Member m";
//            String query = "select 'a' || 'b' from Member m";
//            String query = "select locate('de', 'abcdef') from Member m";
//            String query = "select size(t.members) from Team t";
//            @OrderColumn()
//            String query = "select index(t.members) from Team t";
//            String query = "select function('group_concat', m.username) from Member m";
//            String query = "select m.team.name from Member m";
//            String query = "select t.members from Team t";
//            List<String> result = em.createQuery(query, String.class)
//                    .getResultList();

//            Collection result = em.createQuery(query, Collection.class)
//                    .getResultList();

//            for (String s : result) {
//                System.out.println("s = " + s);
//            }
//            for (Object o : result) {
//                System.out.println("o = " + o);
//            }

            Team teamA = new Team();
            teamA.setName("팀A");
            em.persist(teamA);

            Team teamB = new Team();
            teamB.setName("팀B");
            em.persist(teamB);

            Member member1 = new Member();
            member1.setUsername("관리자1");
            member1.setTeam(teamA);
            em.persist(member1);

            Member member2 = new Member();
            member2.setUsername("관리자2");
            member2.setTeam(teamA);
            em.persist(member2);

            Member member3 = new Member();
            member3.setUsername("관리자3");
            member3.setTeam(teamB);
            em.persist(member3);

            em.flush();
            em.clear();

//            String query = "select m from Member m";
//            String query = "select m from Member m join fetch m.team";
//            String query = "select t from Team t join FETCH  t.members";
//            String query = "select distinct t from Team t join FETCH  t.members";

//            List<Member> result = em.createQuery(query, Member.class)
//                    .getResultList();

//            for (Member member : result) {
//                System.out.println("member = " + member.getUsername() + ", " + member.getTeam().getName());
//            }

//            List<Team> result = em.createQuery(query, Team.class)
//                            .getResultList();
//
//            for (Team team : result) {
//                System.out.println("team = " + team.getName() + " | " + team.getMembers().size());
//                for (Member member : team.getMembers()) {
//                    System.out.println("-> member = " + member);
//                }
//            }

//            String query = "select m from Member m join fetch m.team t";
//
//            List<Team> result = em.createQuery(query, Team.class)
//                            .setFirstResult(0)
//                                    .setMaxResults(1)
//                                            .getResultList();
//
//            System.out.println("result = " + result);
//
//            for (Team team : result) {
//                System.out.println("team = " + team.getName() + " | " + team.getMembers().size());
//                for (Member member : team.getMembers()) {
//                    System.out.println("-> member = " + member);
//                }
//            }

//            String query = "select m from Member m where m.id = :memberId";
//            String query = "select m from Member m where m.team = :team";

//            Member findMember = em.createQuery(query, Member.class)
//                    .setParameter("memberId", member1.getId())
//                    .getSingleResult();

//            List<Member> members = em.createQuery(query, Member.class)
//                    .setParameter("team", teamA)
//                    .getResultList();

//            System.out.println("findMember = " + members);

//            for (Member member : members) {
//                System.out.println("member = " + member);
//            }

//            List<Member> resultList = em.createNamedQuery("Member.findByUsername", Member.class)
//                    .setParameter("username", "관리자1")
//                    .getResultList();
//
//            for (Member member : resultList) {
//                System.out.println("member = " + member);
//            }

            int resultCount = em.createQuery("update Member m set m.age = 20")
                    .executeUpdate();

            System.out.println("resultCount = " + resultCount);

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }

}
