<?php
session_start();
if (!isset($_SESSION['IS_LOGIN'])) {
    header("Location: login.php");
}
include"connectdb.php";
$sql = "SELECT * FROM table1";
$result = mysqli_query($connect, $sql);
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Realtime Chat App</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>

<body>
    
    <div class="wrapper">
        <section class="users">
            <header class="active-user">
                <a href="dashboard.php">
                    <div class="content">
                        <img src="img.jpg" alt="">
                        <div class="details">
                            <span id="username"><?php echo $_SESSION['username']; ?></span>
                            <p>Active Now&ensp;<i class="fas fa-circle" id="activity"></i></p>
                        </div>
                    </div>
                </a>
                <a href="logout.php" class="logout">Logout</a>
            </header>
            <div class="users-list">
                <?php
                $sql = "SELECT * FROM table1 where username <> '$_SESSION[username]' ";
                $result = mysqli_query($connect, $sql);
                if (mysqli_num_rows($result) > 0) { {
                        foreach ($result as $user) {

                ?>
                            <a href="chat.php">
                                <div class="content">
                                    <img src="img.jpg" alt="">
                                    <div class="details">
                                        <span><?php echo $user['username']; ?></span>
                                    <button id="" onclick="ok()"> chat</button>
                                    </div>
                                </div>
                            </a>
                <?php
                        }
                    }
                }
                ?>
            </div>


       
        </section>
    </div>
    <script src="javascript/client.js"></script>
<script> let ok =()=>{
console.log('ok')
}
;ok();
</script>
</body>

</html>
